import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to search");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={2,3,4,5,6,3,5};
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i]){
                System.out.println("Number found at position "+ arr[i]);
            }
        }
    }
}
