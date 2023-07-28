public class LinearSearch_02 {
    boolean searchElement(int[] arr, int target){
        if (arr.length==0) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (arr[i]==target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinearSearch_02 ln =new LinearSearch_02();
        int[] arr = {3,4,0,5,4,6,8,5,43,45,6,7,54,3,45};
        int target=555;
        boolean ans=ln.searchElement(arr, target);
        System.out.println(ans);
    }
}
