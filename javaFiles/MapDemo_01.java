import java.util.*;

class MapDemo_01{
	public static void main(String[] args){
		Map<Character,Integer> map = new TreeMap();
		String s = "Lucknow Junction";
		for(int i = 0; i< s.length(); i++){
			if(map.get(s.charAt(i))==null){
				map.put(s.charAt(i),1);
			}else{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			if(map.get(s.charAt(i))==" ")continue;
		}
		Set<Character> st = map.keySet();
		for(Character ss : st){
			System.out.println(ss + " : "+ map.get(ss));
		}
	}
}
