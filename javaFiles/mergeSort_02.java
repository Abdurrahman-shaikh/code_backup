class mergeSort{
	int[] merge(int[] a, int[] b){
		int i=0,j=0,k=0;
		int[] c=new int[a.length+b.length];
		while(i<a.length && j<b.length){
			if(a[i]<=b[j]){
				c[k++]=a[i++];
			}else{
				c[k++]=b[j++];
			}
		}
		while(i<a.length){
			c[k++]=a[i++];
		}
		while(j<b.length){
			c[k++]=b[j++];
		}
		return c;
	}
	void print(int[] a){
	for(int i=0; i<a.length; i++){
		System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[]){
		int[] arr={2,10,15,20,25};
		int[] arr1={3,8,14,28,30};
		mergeSort m1=new mergeSort();
		int[] result=m1.merge(arr,arr1);
		m1.print(result);
	}
}
