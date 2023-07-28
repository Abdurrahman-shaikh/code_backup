class CDemo{
	int x;
	float y;
	String s;
	CDemo(){}
	CDemo(int a){
	x=a;
	}
	CDemo(int a,float b,String c){
		this(a);
		y=b;
		s=c;
	}
}
class Constructor_05{
	public static void main(String[] args){
		CDemo c1=new CDemo();
		CDemo c2=new CDemo(25);
		CDemo c3=new CDemo(10,23.4f,"AMU");
		Constructor_05 m=new Constructor_05();
		m.printer(c1);
		m.printer(c2);
		m.printer(c3);
	}
	public void printer(CDemo c){
		System.out.println(c.x+" "+c.y+" "+c.s);
	}
}
