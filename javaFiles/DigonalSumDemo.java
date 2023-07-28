class DigonalSumDemo{
	public static void main(String[] args){
		int[][] matrix={{2,4,6,8},{1,3,5,7},{10,20,30,40},{11,22,33,44}};
		int psum=0, ssum=0;
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[i].length;j++){
				if(i==j){
				psum +=matrix[i][j];
				}
				if((i+j)==matrix.length-1){
				ssum +=matrix[i][j];
				}

			}
		}
		System.out.println("Sum of primary digonal element="+psum);
		System.out.println("Sum of secondary digonal element="+ssum);
	}
}
