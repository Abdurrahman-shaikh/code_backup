class ParentDemo_02{
	public void printer(){
		System.out.println("Printer of parent");
	}
}
class Factory{
	public static ParentDemo_02 getInstance(){
		ParentDemo_02 p=new Child();
		return p;
	}
}
class Child extends ParentDemo_02{
	public void printer(){
		System.out.println("Printer of Child");
	}
}
class MainClass{
	public static void main(String[] args){
		ParentDemo_02 p=Factory.getInstance();
		p.printer();
	}
}
