/*
 * Sample Input 
welcometojava
3

Sample Output 
ava
wel

Sort Lexicographically
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalSubString{
    public static String getStringandNumber(String s, int k){
        String smallest ="";
        String largest ="";

        List<String> a = new ArrayList<String>();
        for(int i=0;i<s.length()-k+1;i++){
            a.add(s.substring(i, i+k));
        } 
        Collections.sort(a);
        smallest =a.get(0);
        largest=a.get(a.size()-1);
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s =scanner.next();
        int k =scanner.nextInt();
        scanner.close();
        System.out.println(getStringandNumber(s, k));
    }
    
}