/*
 * Constraints
2 <= N <= 20 .
 1 <= i <= 10
 output format
 N x i = result.
 */

import java.util.Scanner;

public class Multiplication_for_input{
public static void main(String[] args) {
    // Creating scanner class 
    Scanner scanner = new Scanner(System.in);
    int N =scanner.nextInt();
    int result;
    // Print the multiplication for the given input number
    if(N>=2 && N<=20){
        for(int i=1;i<=10;i++){
            result=i*N;
            System.out.println(i+" x "+N+" = "+result);
        }
    }
scanner.close();
}
}