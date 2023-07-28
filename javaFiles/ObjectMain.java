class ObjectDemo{
	int x,y;
       /*	ObjectDemo(int a, int b){
		x=a;
		y=b;
	}*/
	void print(){
		System.out.println(x+" "+y);
	}
}

class ObjectMain{
	public static void main(String args[]){
	ObjectDemo ob1 = new ObjectDemo();
	ObjectDemo ob2 = new ObjectDemo();
	ob1.print();
	ob2.print();
	}
}
