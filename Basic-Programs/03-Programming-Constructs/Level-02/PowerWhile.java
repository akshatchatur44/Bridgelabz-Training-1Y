import java.util.Scanner;
class PowerWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int power=sc.nextInt();
		int result=1;
		int counter=0;
		while(counter<power){
			result*=n;
			counter++;
			}
			System.out.println("Result= "+result);
		
	}
}