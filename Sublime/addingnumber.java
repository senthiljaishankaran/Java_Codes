import java.util.Scanner;
class addingNumber{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int x=sc.nextInt();
		System.out.println("Enter the second Number:");
		int y=sc.nextInt();
		int sum;
		sum=x+y;
		System.out.println("The sum is : "+ sum);
	}
}