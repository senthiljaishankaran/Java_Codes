import java.util.Scanner;
class multiplication{
	public static void main (String args[]){
		int n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer:");
		n=sc.nextInt();
		System.out.println("multiplication table is:");
		for(c=1;c<=10;c++){
			System.out.println(n+" x "+c+" = "+(n*c));
		}
	}
}