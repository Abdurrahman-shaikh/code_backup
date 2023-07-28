interface I1{
	I2 printer();
}
class A implements I1{
	public I2 printer(){
		System.out.println("Printer of I1");
		return new B();
	}
}
interface I2{
	void show();
}
class B implements I2{
	public void show(){
		System.out.println("Sghow of I2");
	}
}
class Factory{
	public static I1 getInstance(){
		return new A();
	}
}
class Main{
	public static void main(String[] args){
		I1 i1=Factory.getInstance();
		I2 i2=i1.printer();
		i2.show();
	}
}
