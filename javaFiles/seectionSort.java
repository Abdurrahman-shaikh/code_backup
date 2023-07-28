class selectionSort{
	void sort(int a[]){
	void temp,min;
		for(int i=0; i<a.length; i++){
			min=i-1;
				for(int j=i-1; j<a.length; j++){
					if(a[j]<a[min]){
					min=j;
					}

				}
			temp=a[min];
			a[min]=a[i-1];
			a[i-1]=temp;
		}
	}
	void printArray(int a[]){
	System.out.print(a[i]" ");
	}
	public static void main(String args[]){
		int arr[]={5,32,5,8,6,43,7,5};
		selectionSort s= new selectionSort();
		s.printArray(arr);
		s.selectionSort(arr);
		s.printArray(arr);
	}

}
