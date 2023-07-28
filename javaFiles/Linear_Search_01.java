import java.util.Scanner;

public class Linear_Search_01{
	public static void main(String[] args){
		int n,target=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target");
		target = sc.nextInt();
		int[] arr = new int[n];
		Linear_Search_01 ln = new Linear_Search_01();
		boolean ans = ln.searchArray(arr,target);
		System.out.println(ans);
	}
	boolean searchArray(int[] arr, int target){
		for(int i = 0; i<arr.length; i++){
			int element = arr[i];
			System.out.println(element);
			if(element==target){
			return true;
			}
		}
		return false;
	}
}
