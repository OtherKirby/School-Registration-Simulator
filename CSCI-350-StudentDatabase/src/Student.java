import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparator, Comparable
{
	
	private String id; //Student ID #
	private String firstName; //First Name
	private String lastName; //Last Name
	private String address; //Street Address
	private String city; //City
	private String state; //State
	private String zip; //Zip Code
	private String number; //Phone Number
	private String major; //Major
	private String minor; //Minor
	private String gpa; //GPA 
	private String studentPhoto; //Student's Profile Picture
	private String totalCredits; // student's total credits
	private ArrayList<Course> studentCourses = new ArrayList<Course>();

	/**
	 * Creates an empty Student object.
	 */
	public Student() {
		id = "N/A";
		firstName = "N/A";
		lastName = "N/A";
		address = "N/A";
		city = "N/A";
		state = "N/A";
		zip = "N/A";
		number = "N/A";
		major = "N/A";
		minor = "N/A";
		gpa = "N/A";
		studentPhoto = null;
		totalCredits = null;
		studentCourses = null;
	}

	/**
	 * 
	 * @param studID Student ID #
	 * @param fName First Name
	 * @param lName Last Name
	 * @param street Street Address
	 * @param cit City
	 * @param st State
	 * @param zipcode Zip Code
	 * @param num Phone Number
	 * @param maj Major
	 * @param min Minor 
	 * @param grade Grade Point Average (GPA)
	 * @param image Student Profile Picture
	 */
	public Student(String studID, String fName, String lName, String street, String cit, String st, String zipcode,
			String num, String maj, String min, String totalCredits, String grade, String image) {
		id = studID;
		firstName = fName;
		lastName = lName;
		address = street;
		city = cit;
		state = st;
		zip = zipcode;
		number = num;
		major = maj;
		minor = min;
		this.totalCredits = totalCredits;
		gpa = grade;
		studentPhoto = image;
	}
	/**
	 * Returns Student's ID
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets Student's ID 
	 * @param id id (Student ID)
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns Student's first name
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets Student's first name
	 * @param firstName First Name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns Student's last name
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets Student's last name
	 * @param lastName Last Name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns Student's address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets Student's address
	 * @param address Street Address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns Student's city
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets Student's city
	 * @param city City
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns Student's state
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets Student's state
	 * @param state State
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Returns Student's zip code
	 * @return
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets Student's zip code
	 * @param zip Zip Code
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Returns Student's Phone Number
	 * @return number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets Student's Phone Number
	 * @param number Phone Number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * Returns Student's major
	 * @return major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * Sets Student's major
	 * @param major Major
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * Returns Student's minor
	 * @return
	 */
	public String getMinor() {
		return minor;
	}

	/**
	 * Sets Student's minor
	 * @param minor Minor
	 */
	public void setMinor(String minor) {
		this.minor = minor;
	}

	/**
	 * Returns Student's GPA
	 * @return gpa
	 */
	public String getGpa() {
		return gpa;
	}

	/**
	 * Sets Student's gpa
	 * @param gpa
	 */
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	/**
	 * Returns Student's photo
	 * @return studentPhoto
	 */
	public String getStudentPhoto() {
		return studentPhoto;
	}

	/**
	 * Sets Student's Photo
	 * @param studentPhoto Student's Photo
	 */
	public void setStudentPhoto(String studentPhoto) {
		this.studentPhoto = studentPhoto;
	}
	
	public String getTotalCredits()
	{
		return totalCredits;
	}
	
	public void setTotalCredits(String credits)
	{
		totalCredits = credits;
	}

	public String toString() {
		return "Student \nID: " + id + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nStreet Address: "
				+ address + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zip + "\nPhone Number: " + number
				+ "\nMajor" + major + "\nMinor: " + minor + "\nGPA: " + gpa + "\n Student Photo: " + studentPhoto;
	}
	
	public ArrayList<Course> getStudentCourses()
	{
		return studentCourses;
	}
	
	public void setStudentCourses(ArrayList<Course> studentCourses)
	{
		this.studentCourses = studentCourses;
	}


	@Override
	public int compareTo(Object arg0) 
	{
		return 0;
	}

	@Override
	public int compare(Object arg0, Object arg1)
	{
		return 0;
	}

}
