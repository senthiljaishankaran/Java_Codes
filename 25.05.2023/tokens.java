/*
 * Sample Input

He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
 */

import java.util.Scanner;

public class tokens{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String str =sc.nextLine();
        str=str.trim();
        if(str.length() == 0){
            System.out.println(0);
        }
        else{
            String[] str_arr=str.split("['!?,._@ ]+");
            System.out.println(str_arr.length);
            for(String s:str_arr){
                System.out.println(s);
            }
        }
        sc.close();
    }
}