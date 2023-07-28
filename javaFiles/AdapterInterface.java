interface AdapterInterface{
	void show();
	void printer();
	void display();
}
class AdapterClass implements AdapterInterface{
	public void show(){}
	public void printer(){}
	public void display(){}
}
class AdapterDemo extends AdapterClass{
	public void printer(){
		System.out.println("printer");
	}
}
class MainClass{
	public static void main(String[] args){
		AdapterDemo ac=new AdapterDemo();
		ac.printer();
	}
}
