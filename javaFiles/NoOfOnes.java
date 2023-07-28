class NoOfOnes{
	public static void main(String[] args){
	int x=200;
	int count=0;
		while(x!=0){
		count++;
		x=x & (x-1);
		}
	System.out.println(count);
	}
}
