import java.util.*;
import java.lang.*;

class SuperSetDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		SuperSetDemo ssd = new SuperSetDemo();
		ArrayList<ArrayList<Integer>> al;
		al = ssd.getSuperSet(arr);
		for (ArrayList<Integer> a : al) {
			System.out.print("{ ");
			for (Integer i : a) {
				System.out.print(i + " ");
			}
			System.out.print("}");
		}
	}

	ArrayList<ArrayList<Integer>> getSuperSet(int[] a) {
		int max = (int) Math.pow(2, a.length);
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		for (int i = 0; i < max; i++) {
			ArrayList<Integer> ss = new ArrayList<>();
			int k = i, m = a.length - 1;
			while (k != 0) {
				if ((k & 1) == 1) {
					ss.add(a[m]);
				}
				m--;
				k = k >> 1;
			}
			al.add(ss);
		}
		return al;
	}
}
