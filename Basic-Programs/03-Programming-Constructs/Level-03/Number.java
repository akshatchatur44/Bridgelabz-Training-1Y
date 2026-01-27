import java.util.Scanner;
class Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int tem=num;
		int sum=0;
		while(tem!=0){
			sum+=(tem%10);
			tem=tem/10;
		}
		if(num%sum==0)
		    System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
	}
}
			