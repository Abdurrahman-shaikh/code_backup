import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[] args){
		int num,deno;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Enter Numerator : ");
			num=sc.nextInt();
			System.out.println("Enter Denominator : ");
			deno=sc.nextInt();
			System.out.println("Result= "+(num/deno));

		}
	}
}
