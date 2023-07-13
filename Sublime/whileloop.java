import java.util.Scanner;
class whileloop{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int n;
		while((n=sc.nextInt())!=0){
			System.out.println("You entered: "+n);
			System.out.println("Enter an Interger:");
		}
		System.out.println("Out of Loop");
	}
}