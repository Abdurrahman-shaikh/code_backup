import java.util.*;

class Frequency{
	public static void main(String[] args){
		String s = "Lucknow Junction  K";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == ' ')continue;
			if(hm.containsKey(c)){
				hm.put(c,hm.get(c)+1);
			}else{
				hm.put(c,1);
			}
		}
		Set<Character> st = hm.keySet();
		for(Character ch : st){
			System.out.println(ch+" "+hm.get(ch));
		}
	}
}
