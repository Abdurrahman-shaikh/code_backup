class GenericClass<T,M>{
	private T a;
	private M b;
	public GenericClass(T x,M y){
		a=x;
		b=y;
	}
	public void setA(T a){
		this.a=a;
	}
	public T getA(){
		return this.a;
	}
	public void setB(M b){
                this.b=b;
        }
        public M getB(){
                return this.b;
        }
}
class MainClass{
	public static void main(String[] args){
		GenericClass<String,String> gc=new GenericClass<>("Lucknow","Azamgarh");
		String s1=gc.getA();
		String s2=gc.getB();
		System.out.println(s1+" "+s2);
                GenericClass<Integer,Integer> gc2=new GenericClass<>(4,5);
                int x=gc2.getA().intValue();
                int y=gc2.getB().intValue();
                System.out.println(x+" "+y);

	}
}
