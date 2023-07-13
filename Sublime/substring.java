import java.util.Scanner;
class substring{
	public static void main(String args[]){
		int length,c,d;
		String string,sub;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String that needs to substringed");
		string =sc.nextLine();
		length=string.length();
		System.out.println("The sub strings are:");
		for(c=0;c<length;c++){
			for(d=1;d<=length-c;d++){
				sub=string.substring(c,c+d);
				System.out.println(sub);
			}
		}
	}
}