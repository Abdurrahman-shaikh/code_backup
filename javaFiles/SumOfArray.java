class SumOfArray{
	int missingSum(int[] a){
		int n=a.length;
		int sum1=(n*(n+1))/2;
		int sum=0;
		for(int i=0; i<a.length; i++){
			sum += a[i];
		}
		return(sum1-sum);
	}
	public static void main(String args[]){
	int[] arr={3,0,1};
	SumOfArray s=new SumOfArray();
	int result = s.missingSum(arr);
	System.out.println("Missing number= "+result);
	}
}
