import java.util.Scanner;
class exceptionhandling{
	public static void main(String args[]){
		int result,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input two integers");
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			result =a/b;
			System.out.println("The result is:"+ result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception Caught Division by zero:");
		}
	}
}