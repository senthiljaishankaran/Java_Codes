import java.util.Scanner;
class throwsexeception{
	static void eligible(int age){
		if(age<18)
			throw new ArithmeticException("Restricted to vote");
		else
			System.out.println("Welcome to voting");
	}
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		eligible(age);
		System.out.println("Rest of the code is executed");
	}
}