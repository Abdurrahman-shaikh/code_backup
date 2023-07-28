import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Binary_Search bn = new Binary_Search();
      // int[] arr={1,2,3,4,5,6,7,8,9,10};
          int[] arr={9,8,7,6,5,4,3,2,1};
        int target =4 ;
        int len=arr.length-1;
        if (arr[0] < arr[len]) {
            int result=bn.searchInAscen(arr,target);
            System.out.println(result);
        }
        if (arr[0] > arr[len]) {
            int result=bn.searchInDesc(arr,target);
            System.out.println(result);
        }
    }

    int searchInAscen(int[] arr, int target){
        int start =0;
        int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start)/2;
                if(target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        return -1;
    }
    int searchInDesc(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start)/2;
                if(target < arr[mid]){
                    start = mid+1;
                }else if(target > arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        return -1;
    }
    
}