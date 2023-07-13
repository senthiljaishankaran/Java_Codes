/*
 * 
 * Sample Input
madam

Sample Output
Yes
 */
import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    String pal =scanner.next();
    String rev="";
    for(int i=pal.length()-1;i>=0;i--){
        rev =rev+pal.charAt(i);
    }
    if(rev.equals(pal)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    scanner.close();
}    
}
