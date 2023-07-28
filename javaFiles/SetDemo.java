import java.util.*;

class SetDemo{
	public static void main(String[] args){
		Set<Integer> st = new TreeSet<>();
		st.add(10);
		st.add(20);
		st.add(15);
		st.add(20);
		System.out.println(st.size());
		for(Integer i : st){
			System.out.println(i);
		}
	}
}
