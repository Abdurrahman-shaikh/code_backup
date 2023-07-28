class NonGeneric{
	<T>void printData(T t){
		System.out.println(t);
	}
}
class MainClass{
	public static void main(String[] args){
		NonGeneric ng=new NonGeneric();
		ng.<String>printData("Lucknow");
	}
}
