import java.util.Scanner;
class factorial{
	public static void main(String args[]){
		int i,j,fact=1;
		Scanner sc=new Scanner(System.in);
		j=sc.nextInt();
		if(j<0)
			System.out.println("Number should not be negative");
		else{
			for(i=1;i<=j;i++)
				fact=fact*i;
			System.out.println("Factorial of "+j+" is "+fact);
		}
	}
}