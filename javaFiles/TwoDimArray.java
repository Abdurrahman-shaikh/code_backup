import java.util.Scanner;
/**
 * TwoDimArray
 */
class TwoDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*		int arr[][] = new int[3][];
		arr[][]={
		{2, 3, 4},
		{3, 4, 56},
		{4, 3}
		}; */
		int n,m;
		System.out.println("Enter the size of row");
		n = sc.nextInt();
		System.out.println("Enter the value of column");
		m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int row = 0; row <arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
			arr[row][col] = sc.nextInt();
			}
		}
        	for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

	}
}
