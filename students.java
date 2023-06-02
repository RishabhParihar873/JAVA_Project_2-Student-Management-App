package StudentManagement;
import java.util.Scanner;

public class students 
{
	private String firstName;
	private String lastName;
	private String year;
	private String id;
	private String courses = "";
	private int tuituionBalance = 0;
	private int costOfCourse = 600;
	private static int enrollno = 1000;
	
	//constructor: prompt the name and year
	public students() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student's First Name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter Student's Last Name: ");
		this.lastName = sc.nextLine();
		//\n1 for First year \n2 for Second year \n3 for third year \n4 for final year
		System.out.print("Enter Student's Year: ");
		this.year = sc.nextLine();
		
		
	}

	
	//generate an id
	public void setUniqueId()
	{
		this.id = year + "_" + enrollno;
		//System.out.println("Your 5 digits unique Student ID is:" + this.id);
		enrollno++;
	}
	
	//Enroll in courses
	public void enroll() {
		do {
			System.out.println("Enter the courses(Q to Quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) 
			{
				courses = courses + "\n"+ course;
				System.out.println("ENROLLED IN: "+courses);
				tuituionBalance = tuituionBalance + costOfCourse;
				//System.out.println("Tuition Balance: " + tuituionBalance);
			}
			else 
			{
				System.out.println("ENROLLED IN: "+ courses);
				//System.out.println("Tuition Balance: " + tuituionBalance);
				break;
			}
			
		}while(1 != 0);
	}
	
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuituionBalance);
	}
	
	//pay tuition
	public void paytution() {
		viewBalance();
		System.out.println("Enter the amount you want to pay in digits.");
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		tuituionBalance = tuituionBalance - pay;
		System.out.println("Payment of $ " +pay+" Successful!");
		viewBalance();
		
	}
	
	//show status
	public void showInfo() {
		System.out.println();
		System.out.println("******************** \nName: " +firstName + " " + lastName +"\nEnrollment Number: " + id+"\nCourses: " + courses + "\nBalace: $" + tuituionBalance +"\n____________________"); 
	}
	
}
