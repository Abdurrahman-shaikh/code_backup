class RunningSumDemo{
	void runningSum(int[] a){
		for(int i=0; i<a.length; i++){
			a[i]=a[i]+a[i-1];
			}
	}
	void PrintArray(int[] a){
		for(int i=0; i<a.length; i++){
		System.out.println(a[i]+a[i-1]);
		}
	}
public static void main(String args[]){
	int arr[]={2,4,2,5,6,4,8};
	RunningSumDemo rsd= new RunningSumDemo();
	rsd.PrintArray(arr);
	rsd.runningSum(arr);
	rsd.PrintArray(arr);
	}
}
