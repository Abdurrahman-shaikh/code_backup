import java.util.*;

class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Character> tm = new TreeMap<>();
        tm.put(5, 'd');
	tm.put(1,'e');
        tm.put(3, 'f');
        tm.put(6,'r');
        Map.Entry<Integer, Character> firstEntry = tm.firstEntry();
        if (firstEntry != null) {
            Integer key = firstEntry.getKey();
            Character value = firstEntry.getValue();
            System.out.println("first Entry: Key = " + key + ", Value = " + value);
        } else {
            System.out.println("TreeMap is empty.");
        }
    }
}
