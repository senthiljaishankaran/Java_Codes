import java.util.*;
class scannerclasss{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Entering the name
		System.out.println("Enter your Name: ");
		String name =sc.nextLine();

		// Entering the Department
		System.out.println("Enter your department: ");
		String depart=sc.nextLine();

		// Printing the inputs
		System.out.println("Entered name:" + name);
		System.out.println("Entered department:" + depart);
	}
}