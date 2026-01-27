import java.util.Scanner;
class Armstrong{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int org=num;
		int sum=0;
		while(org!=0){
			int digit=org%10;
			sum+=(digit*digit*digit);
			org=org/10;
		}
		if(sum==num)
			System.out.println("Armstrong Number");
		else 
			System.out.println("Not an Armstrong Number");
		
	}
}