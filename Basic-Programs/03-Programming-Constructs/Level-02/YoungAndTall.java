import java.util.Scanner;
class YoungAndTall{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		int h1=sc.nextInt();
		int h2=sc.nextInt();
		int h3=sc.nextInt();
		int youngest=Math.min(a1,Math.min(a2,a3));
		int tallest=Math.max(h1,Math.max(h2,h3));
		System.out.println("Youngest age= "+youngest);
		System.out.println("Tallest height= "+tallest);
	}
}