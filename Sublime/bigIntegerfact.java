import java.util.Scanner;
import java.math.BigInteger;
class bigIntegerfact{
	public static void main(String args[]){
		int n,c;
		BigInteger fact=new BigInteger("1");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to find Factorial:");
		n=sc.nextInt();
		for(c=1;c<=n;c++){
			fact=fact.multiply(BigInteger.valueOf(c));
		}
		System.out.println("Factorial for given Number "+n+ " is :"+fact);
		}
	}