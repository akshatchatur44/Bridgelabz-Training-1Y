import java.util.Scanner;
class HeightConversion{
    public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
		double height= sc.nextInt();
		double inches= height/2.54;
		double foot= inches/12;
		System.out.println("Your height in cm is "+height+" while in feet is "+foot+" and inches is "+inches);
	}
}