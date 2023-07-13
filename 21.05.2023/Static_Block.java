/*
 * Sample Input 1
 1
 3

 Sample Output 1
 3

 Sample Input 2
 -1
 2

 Sample Output 2
 java.lang.Exception: Breadth and height must be positive

 Use Static block
 What is static block?
 static block is a set of instructions that is run only once when a class is loaded into memory
 */

import java.util.Scanner;

public class Static_Block {
    public static int B,H;
    private static boolean flag = false;
    static{
        Scanner scanner = new Scanner (System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if(B>0 && H> 0){
            flag = true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scanner.close();
    }
    public static void main(String[] args) {
        if(flag){
            int area =B*H;
            System.out.println(area);
        }
    }
}
