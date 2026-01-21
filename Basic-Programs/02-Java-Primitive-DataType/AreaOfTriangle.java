import java.util.Scanner;
class AreaOfTriangle{
    public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
		float base= sc.nextFloat();
		float height= sc.nextFloat();
		float area=(base*height)/2;
		System.out.println("Area of Triangle = "+area+" square units");
	}
}