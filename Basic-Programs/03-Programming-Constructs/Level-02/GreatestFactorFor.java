import java.util.Scanner;
class GreatestFactorFor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int GreatestFactor=1;
		for(int i=number-1;i>=1;i--){
			if(number%i==0){
				GreatestFactor=i;
				break;
			}
		}
		System.out.println("GreatestFactor= "+GreatestFactor);
	}
}
		