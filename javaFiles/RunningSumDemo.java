class RunningSumDemo{
        void RunningSum(int[] a){
                for(int i=1; i<a.length; i++){
                        a[i]=a[i]+a[i-1];
                }
        }
        void printArray(int[] a){
                for(int i=0; i<a.length; i++){
                	System.out.print(a[i]+" ");
                }
		System.out.println();
        }
void Reverse(int [] a){
	int i=0, j=a.length-1,temp;
	while(i<j){
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	i++;
	j--;
	}
}
public static void main(String args[]){
        int[] arr={2,4,2,5,6,4,8};
        RunningSumDemo rsd=new RunningSumDemo( );
        rsd.printArray(arr);
        rsd.RunningSum(arr);
        rsd.printArray(arr);
	rsd.Reverse(arr);
	rsd.printArray(arr);
        }
}
