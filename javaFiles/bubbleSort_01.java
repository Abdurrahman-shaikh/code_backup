class bubbleSort_01{
	void bubble(int[] a){
		for(int i=1; i<a.length; i++){
			for(int j=1;j<=a.length-i; j++){
				if(a[j-1]>a[j]){
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	void print(int[] a){
		for(int i=0; i<a.length; i++){
		System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
	int[] arr={3,2,8,5,7,3};
	bubbleSort_01 b=new bubbleSort_01();
	b.print(arr);
	b.bubble(arr);
	b.print(arr);
	}
}
