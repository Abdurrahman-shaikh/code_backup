final abstract class AbstractDemo_01{
	public abstract void printer();
        AbstractDemo_01(){
                System.out.println("Constructor of AbstractDemo");
        }

	public void show(){
		System.out.println("Show Method");
	}
}
class ADemo extends AbstractDemo_01{
	ADemo(){
		System.out.println("Constructor of ADemo");
	}
	public void printer(){
		System.out.println("Printer Method");
	}
}
class MainClass{
	public static void main(String[] args){
		ADemo ad=new ADemo();
		ad.printer();
		ad.show();
	}
}
