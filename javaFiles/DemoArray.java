class DemoArray{
       public static void main(String[] args){
                int[][]td=new int[3][5];
                int[][]tdd={{2,3,5},{5},{6,4}};
                for(int i=0; i<tdd.length; i++){
                        for(int j=0; j<tdd[i].length; j++){
                        System.out.print(tdd[i][j]+" ");
                        }
                System.out.println();
                }
        }
}
