/*
 * Sample Input 0
anagram
margana

Sample Output 0
Anagrams
 */
import java.util.Arrays;
import java.util.Scanner;

public class anagarams {
public static void main(String[] args) {
    //Creating scanner for getting input from users
    Scanner sc = new Scanner(System.in);
    String str1 =sc.next();
    String str2=sc.next();
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    // Creating algorithm for anagram checking
    // Checking length both string that they are equal are not
    if(str1.length() == str2.length()){
        // Converting String to CharArray to compare them
        char[] char_array_1 =str1.toCharArray();
        char[] char_array_2 =str2.toCharArray();
        // Sorting the arrays
        Arrays.sort(char_array_1);
        Arrays.sort(char_array_2);
        // Comparing sorted arrays
        boolean results= Arrays.equals(char_array_1, char_array_2);
        if(results){
            System.out.println(str1 +" "+ str2 +" are anagram");
        }
        else{
            System.out.println(str1 +" "+ str2 +" are not anagram");
        }
    }
    else{
        System.out.println(str1 +" "+ str2 +" are not anagram");
    }
    sc.close();
}    
}
