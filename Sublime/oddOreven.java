import java.util.Scanner;
class oddOreven{
	public static void main(String args[]){
		int x;
		Scanner	sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		x=sc.nextInt();
		if(x%2==0){
			System.out.println("The Given Number is even:");
		}
		else

			System.out.println("The Given Number is odd");
	}
}