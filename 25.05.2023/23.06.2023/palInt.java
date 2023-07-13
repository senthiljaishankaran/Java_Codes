import java.util.Scanner;

public class palInt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int revNum =0;
        int remainder;
        int originalNum=num;
        while(num!=0){
            remainder=num%10;
            revNum=revNum*10+remainder;
            num /=10;
        }
        if(originalNum==revNum)
            System.out.println(originalNum + " is a palindrone integer");
        else
            System.out.println(originalNum + " is a palindrone integer");
        }
    }
