import java.util.*;

class SearchTD{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows");
		int n = sc.nextInt();
		System.out.println("Number of columns");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		System.out.println("Enter the target");
		int target = sc.nextInt();
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++){
				System.out.println("Enter data");
				arr[row][col] = sc.nextInt();
			}
		}
		SearchTD s = new SearchTD();
		boolean result = s.search(arr,target);
		System.out.println(result);
	}

	boolean search(int[][] arr, int target){
		for(int row = 0; row<arr.length; row++){
			for(int col = 0; col<arr[row].length; col++){
				if(arr[row][col]==target){
					return true;
				}
			}
		}
		return false;
	}
}
