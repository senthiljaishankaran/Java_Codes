import java.util.Scanner;
class anymulti{
	public static void main(String args[]){
		int a,b,c,d;
		System.out.println("Enter the Number for Multiplication:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();

		for(c=a;c<=b;c++){
			for(d=1;d<=10;d++){
				System.out.println(c+" x "+d+" = "+(c*d));
			}
		}
	}
}