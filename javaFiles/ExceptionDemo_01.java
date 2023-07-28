import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[] args){
		int len;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		len=sc.nextInt();
		int arr[]=new int[5];
		for(int i=0; i<len;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
