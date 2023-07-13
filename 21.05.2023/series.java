/*
 * Given
 * ( a+20 . b), ( a+20 . b + 21 . b), . . . . . , ( a+20 . b + 21 . b + . . . + 2n-1 . b)
 
 * constriants
 * 0 <= q <= 500
0 <= a, b <= 50
1 <= n <= 15

Sample Input
 2
 0 2 10
 5 3 5

 Sample Output
 2 6 14 30 62 126 254 510 1022 2046
 8 14 26 50 98
 */

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        // Creating Scanner class for getting input for t input where t is number of series
        Scanner scanner=new Scanner(System.in);
        int t =scanner.nextInt();
        int sum=0;
        for(int i=0;i<t;i++){
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int n =scanner.nextInt();
        // Code to generate the series for the given input
        if((n>=1 && n<=15) && (a>=0 && a<=50) && (b>=0 && b<=50)){
            int j=0;
            while(j<n){
            int s =(int)Math.pow(2, j) *b;
            sum =sum+s;
            int series =s+a;
            System.out.println(series+" ");
            j++;
            }
            int series=0;
            sum=0;
        }
       System.out.println("");
    }
    scanner.close();
}
}
