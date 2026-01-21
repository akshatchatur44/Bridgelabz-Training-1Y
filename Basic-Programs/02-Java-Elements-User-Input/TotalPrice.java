import java.util.Scanner;
class TotalPrice{
    public static void main(String[] args){
	     Scanner sc =new Scanner(System.in);
		 float unitPrice=sc.nextFloat();
		 float quantity=sc.nextFloat();
		 float price=unitPrice*quantity;
		 System.out.println("The total purchase price is INR "+price+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
		}
	}