import org.w3c.dom.ls.LSException;

/**
 * Binery_Search
 */
public class Binery_Search {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 8, 9, 10 };
        int target = 4;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target == arr[mid]) {
                return mid;
            } else if (target >= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return mid + 1;
    }
}