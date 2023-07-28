class secondMax{
	int Maximum(int[] a){
	int max=a[0];
	int smax=a[0];
	for(int i=0; i<a.length; i++){
		if(a[i]>max){
		smax=max;
		max=a[i];
		}else if(a[i]>smax){
		smax=a[i];
		}
	}
	return smax;
}
	public static void main(String args[]){
	int[] arr={5,2,5,3,5,6,8,3};
	secondMax sc=new secondMax();
	int result=sc.Maximum(arr);
	System.out.println(result+" ");
	}
}
