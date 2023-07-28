class ObjectDemo{
int x,y;
ObjectDemo(int a, int b){
x=a;
y=b;
}
void print(){
System.out.println(x+" "+y);
}
}
class ObjectMain2{
public static void main(String args[]){
ObjectDemo ob1=new ObjectDemo(10,20);
ObjectDemo ob2=new ObjectDemo(5,7);
ob1.print();
ob2.print();
}
}
