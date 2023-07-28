import java.lang.*;
class Sb{
	public static void main(String[] args){
		StringBuilder sb1=new StringBuilder();
		sb1.append("Luclnow");
		sb1.append(" Junction");
		sb1.append("EAST");
//                StringBuilder sb2=new StringBuilder(20);
//                StringBuilder sb3=new StringBuilder("Lucknow");
		System.out.println(sb1.capacity()+"  "+sb1.length());
//                System.out.println(sb2.capacity()+"  "+sb2.length());
//                System.out.println(sb3.capacity()+"  "+sb3.length());
	}
}
