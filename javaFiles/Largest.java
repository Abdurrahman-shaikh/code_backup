class Largest{
        int findLargest(int[] a){
                int max = a[0];
                for(int i=0; i<a.length; i++){
                        if(a[i]>max)
			max=a[i];
                }
	return max;
        }
        public static void main(String args[]){
        int[] arr={2,3,4,5,6,7,3,8,2,8,3,5,85,3,3};
        Largest s=new Largest();
        int result = s.findLargest(arr);
	System.out.println(result);
        }
}

