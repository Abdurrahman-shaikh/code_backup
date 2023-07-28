class CDemo{
	int x;
	float f;
	String s;
	CDemo(){}
	CDemo(int a){
		x=a;
	}
	CDemo(int a, float b){
		x=a;
		f=b;
	}
	CDemo(int a,float b, String c){
		x=a;
		f=b;
		s=c;
	}
	void printer(){
		System.out.println(x+" "+f+" "+s);
	}
}
class CMain{
	public static void main(String args[]){
		CDemo c1 = new CDemo();
		c1.printer();
		CDemo c2 = new CDemo(5);
		c2.printer();
		CDemo c3 = new CDemo(17,25.5f,"Lko");
		c3.printer();
	}
}
