/*
 * Sample Input
 java 100
 cpp 65
 python 50

Sample Output
 ================================
 java           100 
 cpp            065 
 python         050 
 ================================
 */

import java.util.Scanner;

public class output_formatting{
    public static void main(String[] args) {
        // Creating scanner class for number of inputs
        Scanner scanner =new Scanner(System.in);
        int input_times = scanner.nextInt();
        // for loop for printing the String and Number as in sample output
        for(int i=1;i<=input_times;i++){
            String lang =scanner.next();
            int num = scanner.nextInt();
            /*
             * Here we printf to format the output
             * 's' is used to append the Strings in the output
             * 'd' is used to append the integers in the output
             * 0 is prefixed with 3 to give zero to the appending palces on number side
             */
            System.out.printf("%-15s%03d\n",lang ,num);
        }
        scanner.close();
    }
}