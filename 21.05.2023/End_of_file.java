/*
 * End-of-file
 * Printing till there is a input in the program
 */

import java.util.Scanner;

public class End_of_file {
    public static void main(String[] args) {
        // Creating Scanner class object for getting input
        Scanner scanner =new Scanner(System.in);
        int input=1;
        while(scanner.hasNext()){
            String str = scanner.next();
            System.out.println(input + " "+ str);
            input++;
        }
        scanner.close();
    }
}
