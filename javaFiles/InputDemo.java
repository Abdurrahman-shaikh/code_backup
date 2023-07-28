import java.util.Scanner;
class InputDemo{
	public static void main(String[] args){
		String data;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetyr a String");
		data=sc.nextLine();
		System.out.println("Entered Data is : "+data);
		int x=Integer.parseInt(data);
		System.out.println("Entered number is : "+x);
		float ft=Float.parseFloat(data);
	}
}
