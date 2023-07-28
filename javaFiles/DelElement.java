class DelElement{
	public static int[] Delete(int a[], int index){
		int n=a.length;
		int i=0;
		for(i=0; i<n; i++){
			if(a[i]==index){
			break;
			}if(i==n){
			return a;
			}
		}
		for(int j=i; j<n-1; j++){
			a[j]=a[j+1];
		}
		int arr2[]=new int[n];
			for(int j=0; j<n-1; j++){
			arr2[j]=a[j];
			}
	return arr2;
	}
        public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int result[] = Delete(arr,2);
		for(int i=0; i<arr.length; i++){
        	System.out.print(result[i]+" ");
		}
        }
}

