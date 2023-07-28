class ShiftOprator_03{
	public static void main(String args[]){
	int count=0;
	int x=546710;
		while(x!=0){ //Exicute untill number become zero
		if((x&1)==1)count++; //if x and opration with 1 gives output 1 then incriment the count by 1
		x=x>>1; //right shift the value by one
		}
	System.out.println(count);
	}
}
