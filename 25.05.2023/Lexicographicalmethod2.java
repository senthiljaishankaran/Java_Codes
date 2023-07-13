import java.util.Scanner;

public class Lexicographicalmethod2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s= scanner.nextLine();
        int k =scanner.nextInt();
        String min =s.substring(0, k);
        String max = s.substring(0, k);
        for(int i=1;i<s.length()-k+1;i++){
            String sub =s.substring(i, i+k);
            if(sub.compareTo(min)<0){
                min=sub;
            }
            if(sub.compareTo(max)>0){
                max=sub;
            }
        }
        scanner.close();
        System.out.println(min);
        System.out.println(max);
    }
}
