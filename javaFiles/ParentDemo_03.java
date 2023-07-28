class ParentDemo_01{
	ParentDemo_01(){
	System.out.println("Conmstructor of parent");
	}
}
class Child extends ParentDemo_01{
	Child(){
	System.out.println("Constructor of child");
	}
}
class Main{
public static void main(String[] args){
	Child p=new Child();
    }
}
