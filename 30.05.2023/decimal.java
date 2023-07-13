/*
 * Sample Input
 9
 -100
 50
 0
 56.6
 90
 0.12
 .12
 02.34
 000.000
Sample Input
 90
 56.6
 50
 02.34
 0.12
 .12
 0
 000.000
 -100
 */
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class decimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Comparator<String> comparator =new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                BigDecimal a= new BigDecimal(o1);
                BigDecimal b= new BigDecimal(o2);
                return b.compareTo(a);
                
            }
            
        };
        Arrays.sort(s, 0, n, comparator);
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
