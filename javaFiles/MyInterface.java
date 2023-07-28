interface MyInterface{
	public static final int age=20;
	static void printer(){
		System.out.println("printer in Interface");
	}
}
class MyClass implements MyInterface{
	 public static void printer(){
		System.out.println("Printer");
	}
	public static void main(String[] args){
//		System.out.println(MyInterface.age);
//		MyClass mc=new MyClass();
//		System.out.println(mc.age);
//		System.out.println(MyClass.age);
		MyInterface.printer();
		MyClass.printer();
//		mc.printer();
	}
}
