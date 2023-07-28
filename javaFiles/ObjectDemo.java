class MyClass<T>{
	T x;
}
class MainClass{
	public static void main(String[] args){
		MyClass<String> m1=new MyClass<>();
		m1.x="Lucknow";
		MyClass<Integer> m2=new MyClass<>();
		m2.x=new Integer(20);
		String s=m1.x;
		int a=m2.x.intValue();
		System.out.println(s+" "+a);
		}
}
