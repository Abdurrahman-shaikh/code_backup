class ParentDemo{
	void show(){
		System.out.println("Show of Parent");
	}
}
class Child extends ParentDemo{
	void show(){
		System.out.println("Show of child");
	}
	void Display(){
		System.out.println("Display of child");
	}
}
class Main{
public static void main(String[] args){
	ParentDemo p=new ParentDemo();
	p.show();
	Child c=new Child();
	c.show();
	c.Display();
	ParentDemo p2=new Child();
	p2.show();
//	p2.display();
	}
}

