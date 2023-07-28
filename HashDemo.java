import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
        Map<Character,Integer> m2 = new HashMap<>();
        m2.put('A',1);
        m2.put('B',2);
        System.out.println(m2.get('A'));
        System.out.println(m2.get('B'));
        m2.put('A',5);
        System.out.println(m2.size());
        System.out.println(m2.get('A'));
    }
}
