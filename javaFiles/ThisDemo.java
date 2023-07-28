class ThisDemo{
	void print(){
		System.out.println("Hello");
	}
	void show(){
		this.print();
	}
	public static void main(String[] args){
		ThisDemo td=new ThisDemo();
		td.show();
	}
}
