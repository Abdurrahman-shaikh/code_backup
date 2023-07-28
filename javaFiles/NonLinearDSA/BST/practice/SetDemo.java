import java.util.*;

class ListDemo{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(3);
		Iterator<Integer> itr = list.iterator();
//		System.out.println(list.remove(2));
		while(itr.hasNext()){
			int element = itr.next();
			itr.next();
			itr.next();
			if(element == 4){
				itr.remove();
			}else{
				System.out.println(element);
			}
		}
	}
//        	System.out.println(list);
}
