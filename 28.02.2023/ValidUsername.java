import java.util.Scanner;
class usernamevalidator{
    public static final String regex="^[A-Za-z]\\w{7,29}$";
}

public class ValidUsername {
    private static final Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int n =Integer.parseInt(sc.nextLine());
        while(n-- !=0){
            String username =sc.nextLine();
            if(username.matches(usernamevalidator.regex)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        
    }
}

