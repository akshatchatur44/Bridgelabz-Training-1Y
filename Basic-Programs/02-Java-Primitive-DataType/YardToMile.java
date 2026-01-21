import java.util.Scanner;
class YardToMile{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		float feet= sc.nextFloat();
		float yard= feet/3;
		float miles= yard/1760;
		System.out.println("Distance in yards= "+yard+" Distance in miles = "+miles);
	}
}