class mergeSort_03{
	void merge(int[] a, int[] b){
		int i=a.length-1,k=b.length-1,j=b.length-a.length-1;
		while(i>=0 && j>=0){
			if(a[i]>=b[j]){
				b[k--]=a[i--];
			}else{
				b[k--]=b[j--];
			}
		}
		while(i>=0){
			b[k--]=a[i--];
		}
		while(j>=0){
			b[k--]=b[j--];
		}
	}
	void print(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int[] arr={2,4,6,8,10};
		int[] arr1={3,5,15,18,0,0,0,0,0};
		mergeSort_03 m1=new mergeSort_03();
		m1.merge(arr,arr1);
		m1.print(arr1);
		m1.print(arr);
	}
}
