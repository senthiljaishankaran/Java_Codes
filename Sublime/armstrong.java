import java.util.Scanner;
import java.math.*;

class armstrong{
	public static void main(String args[]){
		int num,temp,result=0,digit=0,remainder;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		while(temp!=0){
			digit++;
			temp=temp/10;
		}
		temp=num;
		while(temp!=0){
			remainder=temp%10;
			result+=Math.pow(remainder,digit);
			temp/=10;
		}
		if(result==num){
			System.out.println("Armstrong Nummber");
		}
		else{
			System.out.println("Not an Armstrong Nummber");
		}
	}
}