import java.util.Scanner;
class reverseNumber{
	public static void main(String args[]){
		int rev=0;
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		num=sc.nextInt();
		while(num != 0){
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}	
		System.out.println("Reverse Number: "+ rev);
	}
}