import java.util.Scanner;
class swappingwithouttemp{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();

		System.out.println("Before swapping Value of x is "+x+" & y is "+y);

		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("After swapping Value of x is "+x+" & y is "+y);
	}
}