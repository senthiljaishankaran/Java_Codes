import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TagContentExtractor {
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile("<([^>]+)>([^>]+)</\\1>");
        Scanner sc =new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        while(num >0){
            String match=sc.nextLine();
            Matcher m =pattern.matcher(match);
            int matches =0;
            while(m.find()){
                matches++;
                System.out.println(m.group(2));
            }
            if(matches ==0){
                System.out.println("none");
            }
            num-- ;
        }
        sc.close();
    }
}
