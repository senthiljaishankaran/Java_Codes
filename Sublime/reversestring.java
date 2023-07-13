import java.util.Scanner;
class reversestring{
	public static void main(String args[]){
	String original,reverse_1=" ",reverse_2=" ";
	Scanner sc =new Scanner(System.in);
	original=sc.nextLine();
	for(int i=original.length()-1;i>=0;i--){
		reverse_1+=original.charAt(i);
	}
	System.out.println(reverse_1);
	}
}