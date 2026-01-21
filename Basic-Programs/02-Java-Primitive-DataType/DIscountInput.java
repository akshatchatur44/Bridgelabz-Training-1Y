import java.util.Scanner;
class DiscountInput{
    public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
		int fee = sc.nextInt();
		int DiscountPercent=sc.nextInt();
		double discountamount=(fee*DiscountPercent)/100;
		double discountedfee= fee-discountamount;
		System.out.println("The discount amount is INR "+discountamount+" and finaldiscounted fee is INR "+discountedfee);
	}
}