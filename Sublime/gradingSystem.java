import java.util.Scanner;
class gradingSystem{
	public static void main(String args[]){
		int markObtained;
		int passingMarks=40;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Obtained mark:");
		markObtained=sc.nextInt();
		if(markObtained>=passingMarks){
			if(markObtained>=90 && markObtained<100)
				System.out.println("Grade for the Obtained mark is:A");
			if(markObtained>=75 && markObtained<90)
				System.out.println("Grade for the Obtained mark is B");
			if(markObtained>=60 && markObtained<75)
				System.out.println("Grade for the Obtained mark is C");
			else
				System.out.println("Grade for the obtaine mark is D");
		}
		else
			System.out.println("Failed Please try again");
	}
}