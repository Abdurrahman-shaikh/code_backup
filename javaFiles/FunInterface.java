interface MyInterface{
	void printer(String s);
}
class MyClass{
	public void show(MyInterface mi){
		mi.printer();
	}
}
class MainClass{
	public static void main(String[] args){
		MyClass m=new MyClass();
//		m.show(()->System.out.println("Printer"));
//		m.show(()->{
//		System.out.println("Printer2");
//		System.out.println("Hello");
//		});
		String s="Azamgarh";
		MyInterface mi=(s)->{
			System.out.println("Hello");
			System.out.println("Azmi");
			System.out.println(s);
		};
		m.show(mi);
	}
}
