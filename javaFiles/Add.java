class Func{
	int a;
	int b;
	Func(int x, int y){
		a=x;
		b=y;
	}
	void display(){
	System.out.println("The addition of the number is "+ a+b);
	}
}
class Main{
	public static void main(String arge[]){
		Func f= new Func(2,4);
		f.display();
	}
}
