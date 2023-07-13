import java.util.Scanner;
class whilecontinue{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Enter a Integer:");
			n=sc.nextInt();
			if(n!=0){
				System.out.println("You Entered: "+n);
				continue;
			}
			else{
				break;
			}
		}
	}
}