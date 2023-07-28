import java.util.*;

public class ArrayList_01 {
    public static void main(String[] args) {
	int n;
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	n = sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(5);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)+ " ");
        }
	System.out.println("Size of the array is " +list.size());
    }
}
