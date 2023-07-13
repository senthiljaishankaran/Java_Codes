import java.util.Scanner;
class pal{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		int length=in.length();
		int i,begin,mid,end;
		begin=0;
		end=length-1;
		mid=(begin+end)/2;
		for(i=begin;i<=mid;i++){
			if(in.charAt(begin)==in.charAt(end)){
				begin++;
				end--;
			}
			else
				break;
		}
		if(i == mid+1)
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
	}
}