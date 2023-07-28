/**
 * @author azmi
 */
public class SearchInTwoD {
    public static void main(String[] args) {
        int[][] arr= {
            {2,3,4,5},
            {6,5,4,3,56,4},
            {6,45,34,2,354,4}
        };
        int target = 4;
        int[] ans = search(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
