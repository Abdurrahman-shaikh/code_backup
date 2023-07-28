public class Find_Min {
    int findMin(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min;
        min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,3,6,77,4,1};
        Find_Min fm = new Find_Min();
        int ans = fm.findMin(arr);
        System.out.println(ans);
    }
}
