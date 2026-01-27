import java.util.Scanner;
class GradeCal{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int phy=sc.nextInt();
		int chem=sc.nextInt();
		int math=sc.nextInt();
		int avg=(phy + chem + math)/3;
		if(avg>=80)
			System.out.println("Grade A");
		else if(avg>=70)
			System.out.println("Grade B");
		else if(avg>=60)
			System.out.println("Grade C ");
		else if (avg>=50)
			System.out.println("Grade D");
		else if(avg>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade R");
	}
}