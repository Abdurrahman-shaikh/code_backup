class CDemo{
    int x;
    float f;
    String s;

    CDemo(){

    }
        CDemo(int a){
            x=a;
        }

CDemo(int a, float b){
x=a;
f=b;
}
CDemo(int a,float b, String c){
x=a;
f=b;
s=c;
}
void print(){
System.out.println(x+" "+f+" "+s);
}
public static void main(String args[]){
CDemo c1=new CDemo(2);
c1.print();
CDemo c2=new CDemo(2,3,"d");
c2.print();
CDemo c3= new CDemo(4,5);
c3.print();
}
}