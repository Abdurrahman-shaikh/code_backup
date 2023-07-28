interface AnInterface{
	void show();
}
class ADemo{
	public void caller(AnInterface ai){
		ai.show();
	}
}
class MyClass{
	public static void main(String[] args){
		ADemo ad=new ADemo();
		ad.caller(new AnInterface(){
			public void show(){
				System.out.println("Show");
			}
		});
	}
}
