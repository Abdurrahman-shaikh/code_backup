package mypkg;
class AccessDemo{
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;
	public static void main(String[] args){
	AccessDemo ad=new AccessDemo();
	System.out.println(ad.a+" "+ad.b+" "+ad.c+" "+ad.d);
	}
}
