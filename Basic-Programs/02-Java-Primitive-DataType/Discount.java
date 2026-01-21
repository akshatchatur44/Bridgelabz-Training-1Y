class Discount{
    public static void main(String[] args){
	    int fee=125000;
		int DiscountPercent=10;
		double discountamount=(fee*DiscountPercent)/100;
		double discountedfee= fee-discountamount;
		System.out.println("The discount amount is INR "+discountamount+" and finaldiscounted fee is INR "+discountedfee);
	}
}
		