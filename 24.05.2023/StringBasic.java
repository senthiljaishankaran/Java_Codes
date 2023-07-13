/*
 * Given two strings of lowercase English letters, A and B, perform the following operation:

Sum of length of A and B.
Determine if A is lexicographically larger than B(i.e.: B comes after A in dictionary?).
Capitalize the first letter of A and B and print them on a single line, separated by a space.
 */

import java.util.Scanner;

public class StringBasic{
    public static void main(String[] args) {
        // Creating scanner class
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        scanner.close();
        // Calculating Sum of length A and B
        int length_A=A.length();
        int length_B=B.length();
        System.out.println("Sum of Length "+(length_A+length_B));
        // Determining if B comes before A
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // Changing First char to upper case
        System.out.println(A.substring(0,1).toUpperCase().concat(A.substring(1,length_A))+ " "+B.substring(0, 1).toUpperCase().concat(B.substring(1,length_B)));
    }
}