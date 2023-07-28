import java.util.*;

class GraphDemo{
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<>();
		row1.add(0);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		row1.add(1);
		al.add(row1);

        	ArrayList<Integer> row2 = new ArrayList<>();
        	row2.add(1);
        	row2.add(0);
        	row2.add(1);
        	row2.add(0);
        	row2.add(0);
        	al.add(row2);

        	ArrayList<Integer> row3 = new ArrayList<>();
        	row3.add(1);
        	row3.add(1);
        	row3.add(0);
        	row3.add(0);
        	row3.add(1);
        	al.add(row3);

        	ArrayList<Integer> row4 = new ArrayList<>();
        	row4.add(1);
        	row4.add(0);
        	row4.add(0);
        	row4.add(0);
        	row4.add(1);
        	al.add(row1);

        	ArrayList<Integer> row5 = new ArrayList<>();
        	row5.add(1);
        	row5.add(0);
        	row5.add(1);
        	row5.add(1);
        	row5.add(0);
        	al.add(row5);

		for(ArrayList<Integer> row : al){
		
			for(Integer num : row){
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
