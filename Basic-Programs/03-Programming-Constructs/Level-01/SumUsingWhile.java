import java.util.Scanner;
class SumUsingWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0){
			int i=1;
			int sumWhile=0;
			while(i<=n){
				sumWhile+=i;
				i++;
			}
			int sumFormula=n*(n+1)/2;
			if(sumWhile==sumFormula)
				System.out.println("Both results are correct and equal");
			else
				System.out.println("Results are not equal");
		}
		else{
			System.out.println("Not a natural number");
		}
	}
}
