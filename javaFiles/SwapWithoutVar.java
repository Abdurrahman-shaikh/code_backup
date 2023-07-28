class SwapWithoutVar{
	void swap(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
	public static void main(String args[]){
		SwapWithoutVar s = new SwapWithoutVar();
		s.swap(4,3);
	}
}
