import java.util.Scanner;
class SumUsingFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0){
			int sumFor=0;
			for(int i=1;i<=n;i++){
				sumFor+=i;
			
			}
			int sumFormula=n*(n+1)/2;
			if(sumFor == sumFormula)
				System.out.println("Both results are correct and equal");
			else
				System.out.println("Results are not equal");
		}
		else{
			System.out.println("Not a natural number");
		}
	}
}