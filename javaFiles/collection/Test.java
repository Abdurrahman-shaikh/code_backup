class Test implements Interf{
	public void print(){
		System.out.println("Print");
	}

	public static void main(String[] args){
		Interf i = new Test();
		i.print();
		System.out.println(i.a);
		i.a = 7;
	}
}
