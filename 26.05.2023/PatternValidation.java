import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternValidation{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count =sc.nextInt();
        sc.nextLine();
        while(count>0){
            String pattern= sc.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            count--;
        }
        sc.close();
    }
}