/*
 * Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */
import java.util.Scanner;

public class Std_input_outputII {
    public static void main(String[] args) {
        // Creating scanner class for Datatypes int,double & String
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        double doub = scanner.nextDouble();
        String msg = scanner.next();
        // Printing Sample output
        System.out.println("String:" + msg);
        System.out.println("Double:" + doub);
        System.out.println("Int:"+ num);
        scanner.close();
    }
}
