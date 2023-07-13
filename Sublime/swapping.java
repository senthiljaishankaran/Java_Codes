import java.util.Scanner;
class swapping{
	public static void main(String args[]){

		// Creating a scanner class
		Scanner sc =new Scanner(System.in);
		// Getting input from the user to perform swapping operation
		int num_1=sc.nextInt();
		int num_2=sc.nextInt();

		// swapping
		System.out.println("Values before swapping  "+ num_1 +"  "+num_2);
		int temp =num_1;
		num_1=num_2;
		num_2=temp;
		System.out.println("Values after swapping  "+ num_1 +"  "+num_2);
	}
}