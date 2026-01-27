import java.util.Scanner;
class SumTillN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int total=0;
		do{
			a=sc.nextInt();
			total+=a;
		}while(a!=0);
		System.out.println("Total sum= "+total);
	}
}
			