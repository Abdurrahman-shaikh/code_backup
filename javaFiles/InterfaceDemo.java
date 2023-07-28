interface I1{
	void printer();
}
class InterfaceDemo implements I1{
	public void printer(){
		System.out.println("Printer Method");
	}
	void show(){
		System.out.println("Show Method");
	}
}
class IMain{
	public static void main(String[] args){
		InterfaceDemo id=new InterfaceDemo();
		id.printer();
		id.show();
		I1 i=new InterfaceDemo();
		i.printer();
//		i.show();
	}
}
