class MyBean{
	private int age;
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
}
class MainClass{
	public static void main(String[] args){
		MyBean mb=new MyBean();
		mb.setAge(30);
		System.out.println(mb.getAge());
	}
}
