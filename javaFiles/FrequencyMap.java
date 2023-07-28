import java.util.*;

class FrequencyMap{

    public static void main(String[] args){

        FrequencyMap map = new FrequencyMap();
        String str = "Lucknow Junction";
        map.frequency(str);
    }

    void frequency(String str){
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!map.put(str.charAt(i),1)){
                map.put(i,get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }

        for(Integer n : map){
            System.out.println(n);
        }
    }
}
