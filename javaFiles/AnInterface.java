interface AnInterface{
	void show();
}
class MyClass{
	public static void main(String[] args){
		AnInterface ai=new AnInterface(){
			public void show(){
				System.out.println("Show Method");
			}
		};
		ai.show();
	}
}
