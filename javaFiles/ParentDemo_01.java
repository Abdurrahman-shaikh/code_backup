class ParentDemo_01{
	ParentDemo_01(int n){
	System.out.println("Conmstructor of parent");
	}
}
class Child extends ParentDemo_01{
	Child(){
        super(5);
	System.out.println("Constructor of child");
	}
}
class Main{
public static void main(String[] args){
	Child p=new Child();
        }
}
