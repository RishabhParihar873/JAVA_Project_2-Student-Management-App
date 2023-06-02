package StudentManagement;
import java.util.Scanner;

public class studentmanagementapp {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of Students to be Enrolled: ");
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		 
		students[] student = new students[noOfStudents];
		
		for(int i=0;i<noOfStudents;i++) 
		{
			student[i] = new students();
			student[i].setUniqueId();
			student[i].enroll();
			student[i].paytution();
			student[i].showInfo();
		}
	
	}

}
