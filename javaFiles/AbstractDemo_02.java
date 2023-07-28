abstract class AbstractDemo{
	public abstract void printer();
	public void show(){
		System.out.println("Show Method");
	}
}
class MyClass{
	public void caller(AbstractDemo ad){
		ad.printer();
	}
}
class PDemo extends AbstractDemo{
	public void printer(){
		System.out.println("Printer called");
	}
}
class MainClass{
	public static void main(String[] args){
		MyClass m=new MyClass();
		m.caller(new PDemo());
		m.show();
	}
}
