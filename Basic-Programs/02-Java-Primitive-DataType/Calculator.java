import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
		float number1= sc.nextFloat();
		float number2= sc.nextFloat();
		float add= number1 + number2;
		float sub=number1 -number2;
		float multi=number1*number2;
		float div=number1/number2;
		System.out.println("The addition,subtraction,multiplication and division value of two number "+number1+ " and "+number2+" is "+add+","+sub+","+multi+", and "+div);
	}
}