class ProfitAndLoss{
    public static void main(String[] args){
	    int sellingprice= 191;
		int costprice=129;
		int profit = sellingprice - costprice;
		int profitpercentage= (profit * 100)/costprice;
		System.out.println("The Cost Price is INR "+ costprice + " and Selling Price is INR " + sellingprice+
		" \nThe Profit is INR " +profit+ " and the Profit Percentage is " +profitpercentage);
	}
}