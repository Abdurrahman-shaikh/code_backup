import java.util.*;

class VectorDemo{
	public static void main(String[] args){
/*		Vector<String> vi = new Vector<>();
		vi.add("Lucknow");
       		vi.add("Kapur");
	        vi.add("Jaunpur");
		System.out.println(vi.get(1));
		vi.set(1,"Nagpur");
		System.out.println(vi.get(1));
		Enumeration e = vi.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		} */
		Vector v = new Vector();
		v.add(3);
       		v.add("Kapur");
	        v.add(2.5f);
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		Object x = v.get(0);
		Object s = v.get(1);
		Object ft = v.get(2);
//TypeCasting
		int x1 = ((Integer)v.get(0)).intValue();
		String s1 =(String)v.get(1);
		float f1 = ((Float)v.get(2)).floatValue();
	}

}
