import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class controls a database of Course objects
 * 
 * It is responsible for creating an Arraylist from 
 * a text file containing the data of Course objects
 * 
 * It is also responsible for writing newly created
 * Course objects back to the text file.
 * Uses singleton design pattern to instantiate object.
 * 
 * @author Kirby
 * 
 */

public class CourseDatabase {
	
	ArrayList<Course> courseDB;

	public CourseDatabase(){
		courseDB = new ArrayList<Course>();
	}
	
	/**
	 * @param file The text file containaing the database
	 * @return ArrayList containing data from .txt file
	 * @throws FileNotFoundException
	 */
	public ArrayList<Course> createArrayList(String file) throws FileNotFoundException{
//		ArrayList <String> list = new ArrayList<String>();
//		Scanner s = new Scanner(new File(file));
//		s.useDelimiter(",");
//		while (s.hasNext()){list.add(s.next());}
		
		Scanner scan = new Scanner(new File(file));
		scan.useDelimiter(",");
		int i = 0;
		while(scan.hasNext()){
			String name = scan.next();
			String code = scan.next();
			int credits = scan.nextInt();
			int capacity = scan.nextInt();
			courseDB.set(i, new Course(name, code, credits, capacity));
			i++;
		}
		//s.close();
		scan.close();
		return courseDB;
	}
	
	/**
	 * @param file The text file containing the database
	 * @param courseDB The ArrayList containing data from .txt file originally
	 * @throws IOException
	 */
	public void createFile(String file, ArrayList<Course> courseDB) throws IOException{
        FileWriter writer = new FileWriter(file);
        int size = courseDB.size();
        for (int i=0;i<size;i++) {
            String str = courseDB.get(i).toString() + ",";
            writer.write(str);
//            if(i < size-1)	/*This prevent creating a blank like at the end of the file*/
//                writer.write("\n");
        }
        writer.close();
    }
}
