import java.util.Scanner;
import java.math.BigInteger;
class addingLargeNumber{
	public static void main(String args[]){
		String number1, number2;
		Scanner sc =new Scanner(System.in);
		number1 =sc.nextLine();
		number2 =sc.nextLine();

		BigInteger first_number=new BigInteger(number1);
		BigInteger second_number=new BigInteger(number2);
		BigInteger sum;
		sum=first_number.add(second_number);

		System.out.println("Result=" +sum);

	}
}