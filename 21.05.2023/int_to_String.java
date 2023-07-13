/*
 * Convert the given input which is int to String
 * if converted sucessfully print good job else give error
 * 
 * condition
 * n should be b/t range -100 to 100
 */
import java.util.Scanner;

public class int_to_String {
    public static void main(String[] args) {
        // Getting int input from user
        Scanner scanner = new Scanner(System.in);
        int given_int = scanner.nextInt();
        scanner.close();
        String s =" ";
        // Converting int to String 
       if(given_int>=-100 && given_int<=100){
        s= Integer.toString(given_int);
       }
       if(given_int== Integer.parseInt(s)){
            System.out.println("Good Job");
       }
       else{
        System.out.println("Error");
       }
    }
}
