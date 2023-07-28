import java.util.*;
class MyList{
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);

		ArrayList<Integer> row2 = new ArrayList<>();
                row2.add(4);
                row2.add(5);
                row2.add(6);

		ArrayList<Integer> row3 = new ArrayList<>();
                row3.add(7);
                row3.add(8);
                row3.add(9);

		al.add(row1);
		al.add(row2);
		al.add(row3);

//		for (int i = 0; i < al.size(); i++) {
//            		ArrayList<Integer> row = al.get(i);
//           		for (int j = 0; j < row.size(); j++) {
//                		int value = row.get(j);
//                		System.out.print(value + " ");
//			}
//            		System.out.println();
//		}

		for (ArrayList<Integer> row : al) {
            		for (Integer num : row) {
                		System.out.print(num + " ");
            		}
	            	System.out.println();
        	}
        }
}

