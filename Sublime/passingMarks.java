import java.util.Scanner;
class passingMarks{
	public static void main(String args[]){
		int passingMarks =40;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mark obtianed: ");
		int obtained_mark=sc.nextInt();
		if(obtained_mark>passingMarks)
			System.out.println("Examination passed");
		else
			System.out.println("Failed Try again");
	}
}