import java.lang.*;
class SB{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder("Lucknow");
		sb.delete(4,7);
		System.out.println(sb);
		sb.insert(3,"cc");
                System.out.println(sb);
		sb.replace(0,1,"T");
                System.out.println(sb);
		sb.reverse();
                System.out.println(sb);
		sb.trimToSize();
                System.out.println(sb.length());
	}
}
