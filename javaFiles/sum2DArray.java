class sum2DArray{
	public static void main(String args[]){
		int[][] td={{1,2,3,4},{4,5,6,7},{7,8,9,10},{11,12,13,14}};
		int[][] tdd={{1,2,3,4},{4,5,6,7},{7,8,9,10},{11,12,13,14}};
		sum2DArray rc=new sum2DArray();
		rc.print2DArray(td);
		rc.print2DArray(tdd);
		int[][] result=rc.sum(td,tdd);
		rc.print2DArray(result);
	}
	int[][] sum(int[][] a,int[][] b){
		int[][] c=new int[a.length][b[0].length];
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[i].length; j++){
			c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}

	void print2DArray(int[][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length;j++){
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
