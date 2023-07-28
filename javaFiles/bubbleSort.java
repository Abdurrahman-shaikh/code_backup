class bubbleSort{
	void sort(int[] a){
		int temp,flag;
		for(int i=0; i<a.length; i++){
			System.out.print("outer loop x"+i);
			flag=0;
			for(int j=1; j<a.length-i; j++){
				System.out.print("inner loop "+j);
				if(a[j-1]>a[j]){
					flag++;
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			if(flag==0)break;
		}
	}
	void print(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int arr[]={3,2,4,5,6,7,8};
		bubbleSort b=new bubbleSort();
		b.print(arr);
		b.sort(arr);
		b.print(arr);
	}
}
