class insertionSort{
	void sort(int[] a){
		int temp;
		for(int i=1; i<a.length; i++){
			temp=a[i];
			int j=i-1;
			while(j>=0){
				if(a[j]>temp){
					a[j+1]=a[j];
				}else{
					break;
				}
				j--;
			}
			a[j+1]=temp;
		}
	}
	void print(int [] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
	int[] arr={8,3,6,9,7,0};
	insertionSort in=new insertionSort();
	in.print(arr);
	in.sort(arr);
	in.print(arr);
	}
}
