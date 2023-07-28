class PrivateDemo{
	void printer(){
	show();
	System.out.println("Printer method");
	}
	private void show(){
	System.out.println("Show Method");
	}
}
class PrivateMain{
	public static void main(String[] args){
	PrivateDemo pd=new PrivateDemo();
	pd.printer();
//	pd.show();
	}
}
