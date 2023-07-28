class MyClass{
	int x;
	static final int y=32;
	MyClass(int a){
	x=a;
	}
}
class Constructor_01{
	public static void main(String[] args){
		MyClass m1=new MyClass(10);
		MyClass m2=new MyClass(15);
		m1.x=50;
		//m1.y=49;
		m2.x=25;
		//m2.y=34;
		print(m1);
		print(m2);
		}
		static void print(MyClass m){
		System.out.println(m.x+" "+m.y);
	}
}
