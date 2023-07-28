import java.util.*;

class MapDemo{
	public static void main(String[] args){
		Map<String,String> map = new TreeMap<>();
		map.put("Name","Sadik");
		map.put("Age","21");
		map.put("City","Lko");
//		System.out.println(map.get("Name"));
		map.putIfAbsent("Age","22");
//		System.out.println(map.get("Age"));
//		System.out.println(map.get("City"));
		Set<String> st = map.keySet();
		for(String s : st){
			System.out.println(map.get(s));
		}
	}
}
