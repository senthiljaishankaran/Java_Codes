import java.util.Scanner;
class palindrome2{
	public static void main(String args[]){
		// Getting input from user using Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check palindrome");
		String original=sc.nextLine();
		String reverse="";
		int length =original.length();
		// for loop for checking whether the given string is palindrome or not
		for(int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}	
}