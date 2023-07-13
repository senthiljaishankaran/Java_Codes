/*
 * Given n
 * If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
 */

import java.util.Scanner;

public class Weird{
    public static void main(String[] args) {
        // Creating Scanner obj_variable
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        // Finding the condition of the GIven Number
           if(num%2!=0){
            System.out.println("Given Number is Weird");
           } 
           if(num%2==0 && num>=2 && num<=5){
            System.out.println("GIven Number is not Wierd");
           }
           if(num%2==0 && num>=6 && num<=20){
            System.out.println("Given Number is Wierd");
            if(num%2==0 && num>20){
                System.out.println("Given Number is Not Weird");
            }
            scanner.close();
           }
    }
}