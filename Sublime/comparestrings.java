import java.util.Scanner;
class comparestring{
	public static void main(String args[]){
		String str1,str2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first string:");
		str1=sc.nextLine();
		System.out.println("Enter the second string:");
		str2=sc.nextLine();

		if(str1.compareTo(str2)>0)
			System.out.println(str1+" is larger");
		else if(str1.compareTo(str2)<0)
			System.out.println(str2+" is larger");
		else
			System.out.println("Both are equal length");
	}
}