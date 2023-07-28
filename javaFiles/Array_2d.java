class Array_2d{
	public static void main(String args[]){
		int[][] td=new int[3][];
		for(int i=0; i<td.length; i++){
			td[i]=new int[]{i,i+1,i+2};
			for(int j=0; j<td[i].length;j++){
				System.out.print(td[i][j]+" ");
			}
			System.out.println();
		}
	}
}
