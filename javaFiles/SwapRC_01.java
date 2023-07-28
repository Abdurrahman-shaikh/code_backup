class SwapRC_01{
	public static void main(String args[]){
	int[][] td={{1,2,3,4},{4,5,6,7},{7,8,9,10},{11,12,13,14}};
	SwapRC_01 rc=new SwapRC_01();
	rc.print2DArray(td);
	int temp;
	for(int i=0; i<td.length;i++){
		for(int j=i; j<td[i].length;j++){
		temp=td[i][j];
		td[i][j]=td[j][i];
		td[j][i]=temp;
		}
	}
		rc.print2DArray(td);
	}

	void print2DArray(int[][]a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length;j++){
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
