import java.util.Scanner;

public class StringSubString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();
        System.out.println(str.substring(start, end));
    }
}