package CoreJavaPractice;

public class Wrapperclass{
    public static void main(String[] args) {
        // converting string to int
        String s="100";
        System.out.println(100+s);
        // method to convert String to int
        int converted = Integer.parseInt(s);
        System.out.println(converted+s);

        // converting string to double
        String s1= "12.35";
        System.out.println(s1+12);
        // method to convert string to double
        double d=Double.parseDouble(s1);
        System.out.println(d+12);

        //converting String to boolean
        String b ="true";
        boolean bool=Boolean.parseBoolean(b);
        System.out.println(bool);

        // converting int to string
        int j=100;
        System.out.println(j+20);
        String convsString=String.valueOf(j);
        System.out.println(convsString+20);

        // Number format Exception Example
        String u="100U";
        int c = Integer.parseInt(u); 
        // this will generate Number format Exception
        // because the given String is not a complete int to convert
        System.out.println(c);
    }
}
