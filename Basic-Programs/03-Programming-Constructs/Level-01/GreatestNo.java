import java.util.Scanner;
class GreatestNo{
    public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		if (a>b && a>c){
		    System.out.println("Is the first number the largest ? ,Yes");
		}
		else if(b>a && b>c) {
		    System.out.println("Is the second number the largest ?,Yes");
		}
		else{
		    System.out.println("Is the third number is the largest ?,Yes");
		}
	}
}