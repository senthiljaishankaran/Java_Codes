import java.util.Scanner;
import java.util.StringTokenizer;

public class IpadddressValidationWithoutRegex{
public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    String Ipaddress=sc.nextLine();
    boolean validate=validateIpAddress(Ipaddress);
    if(validate==true){
        System.out.println("Valid");
    }
    else{
        System.out.println("Invalid");
    }
    sc.close();
}
public static boolean validateIpAddress(String Ipaddress){
    boolean bol= false;
    StringTokenizer st =new StringTokenizer(Ipaddress, ".");
    int a =Integer.parseInt(st.nextToken());
    int b =Integer.parseInt(st.nextToken());
    int c =Integer.parseInt(st.nextToken());
    int d =Integer.parseInt(st.nextToken());
    if((a>=0 && a<=255) && (b>=0 && b<=255) && (c>=0 && c<=255) && (d>=0 && d<=255)){
        bol =true;
    }
    return bol;
}
}