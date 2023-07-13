import java.util.*;
class temptofahrenheat{
	public static void main(String args[]){

		// Fahrenheit to Temperature

		float temperature;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Faherhiet to be converted to temperature:" );
		temperature=sc.nextInt();
		temperature=((temperature-32)*5)/9;
		System.out.println("Temperature conversion: "+ temperature);

		//Temperature to Fahrenhiet conversion
		float fahreheit;
		float celsius;
		System.out.println("Enter the Temperature to be converted to fahreheit: ");
		celsius =sc.nextFloat();
		fahreheit=(celsius*9/5)+32;
		System.out.println("Fahrenheit conversion: "+ fahreheit);

	}
}