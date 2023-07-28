import java.util.Arrays;
public class Array {
    public static void main(String[] args) {    
    int[] arr={3,5,3,5,6,4};
    swap(arr,1,3);
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;

    }
}
