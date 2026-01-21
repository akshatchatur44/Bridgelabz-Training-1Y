import java.util.Scanner;
class operators{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int remainder= a%b;
		int quotient=a/b;
		System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two number "+a+ " and "+b);
	}
}