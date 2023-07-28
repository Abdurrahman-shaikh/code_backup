import java.util.*;


class ListDemo{
	public static void main(String[] args){
		ArrayList<String> al =new ArrayList<>();
		al.add("Lucknow");
		al.add("Kanpur");
		al.add("Rampur");
/*		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		} */
		for(String s: al){
			System.out.println(s);
		}
		for(int i=0; i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println(Arrays.toString(al));
	}
}
