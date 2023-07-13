import java.util.Scanner;
class floydtriangle{
	public static void main(String args[]){
		int n,num=1,c,d;
		System.out.println("Enter the number of rows you need:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(c=1;c<=n;c++){
			for(d=1;d<=c;d++){
				System.out.print(num +" ");
				num++;
			}
			num=1;
			System.out.println();
		}
	}
}