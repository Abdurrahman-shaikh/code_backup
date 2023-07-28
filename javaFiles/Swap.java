class Swap{
        void evenOdd(int[] a){
			int l=a.length;
			int i=0;
			int j=l;
        	while(i<=j){
                while(a[i]%2==0)i++;
					while(a[i]%2==1)j--;	
						if(i<j){
						int temp=a[i];
		   				 a[i]=a[j];
		   				 a[j]=temp;
						}
					}
				}
	void printArray(int[] a){
		for(int i=0; i<=a.length; i++){
		System.out.print(a[i]+" ");
		}
	}
        public static void main(String args[]){
        int[] arr={2,2,5,3,5,6,8,3};
        Swap sc=new Swap();
		// sc.print(arr);
        sc.evenOdd(arr);
		sc.printArray(arr);
        }
}
