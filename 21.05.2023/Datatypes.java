/*
 * Sample Input
 5
 -150
 150000
 1500000000
 213333333333333333333333333333333333
 -100000000000000

 Sample Input
 -150 can be fitted in:
 * short
 * int
 * long
 150000 can be fitted in:
 * int
 * long
 1500000000 can be fitted in:
 * int
 * long
 213333333333333333333333333333333333 can't be fitted anywhere.
 -100000000000000 can be fitted in:
 * long
 */

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int times =scanner.nextInt();
        for(int i=0;i<times;i++){
            try{
                long num = scanner.nextLong();
                System.out.println("Number an stored in");
                if(num>=-128 && num<=127){
                    System.out.println("*Byte");
                }
                if(num>=-32768 && num<=32767){
                    System.out.println("*Short");
                }
                if(num>=-2147483648 && num<=2147483647){
                    System.out.println("*Int");
                }
                if(num>=-9223372036854775808L && num<=9223372036854775807L){
                    System.out.println("*Long");
            }
        }
            catch(Exception e){
                System.out.println(scanner.next()+ "  can't be stored anywhere");
            }
        }
        scanner.close();
    }
}
