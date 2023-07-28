class object{
	int a,y;
	object(int x){
	a=x;
	}
	object(int x,int b){
	a=x;
	y=b;
	}
	void print(){
	System.out.println(a+" "+y);
	}
}
class mainf{
	public static void main(String[]args){
		object m1=new object(3);
		object m2=new object(5);
		m1.print();
		m2.print();
	}
}

