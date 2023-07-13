import java.util.Scanner;
class largestOfThreeNumbers{
	public static void main(String args[]){
		// Defining the variables
		int x,y,z;
		// creating Scanner class for taking input from users
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		// Getting input from users
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		// Finding the larget of three numbers
		if((x>y && x>z) )
			System.out.println(x +"  is largest Number");
		else if(y>x && y>z)
			System.out.println(y +" is larget Number");
		else if (z>x && z>y)
			System.out.println(z +"  is the largest Number");
		else
			System.out.println(" Entered Numbers are same");
	}
}