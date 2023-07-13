/*
 *Scanner class is initiated by using below syntax
 Scanner scanner_object_var = new Scanner(System.in)
 */

import java.util.Scanner;

public class Std_input_output{
    public static void main(String[] args) {
        // initiating scanner class
        Scanner scanner=new Scanner(System.in);
        String my_name =scanner.next();
        int Roll_no =scanner.nextInt();
        scanner.close();
        // Printing the Name and corresponding Roll number
        System.out.println("My name is: "+ my_name);
        System.out.println("And my Roll no is: "+ Roll_no);
    }
}