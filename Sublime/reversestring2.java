import java.util.*;
class reversestring2{
	public static void main(String args[]){
		 String reverse1=" ",original;
		 Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		StringBuffer sb=new StringBuffer(original);
		System.out.println(sb.reverse());
	}
}