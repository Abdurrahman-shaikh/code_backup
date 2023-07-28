class SwapRC{
	public static void main(String[] args){
		int i=0,j=0,temp;
		int[][] tdd={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
                for(i=0; i<tdd.length; i++){
                        for(j=0; j<tdd[i].length; j++){
                                System.out.print(tdd[i][j]+" ");
                        }
                        System.out.println();

                }
		for(i=0; i<tdd.length; i++){
			for(j=0; j<tdd[i].length; j++){
				if(i<=j){
                        	temp = tdd[j][i];
				tdd[j][i] = tdd[i][j];
				tdd[i][j] = temp;
				}
				System.out.print(tdd[i][j]+" ");

			}
	                System.out.println();

		}
	}
}
