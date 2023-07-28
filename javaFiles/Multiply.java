public class Multiply {
    int mul(int a, int b){
        int sum=0;
        for (int i = 0; i <a; i++) {
            sum=sum+b;
        }
        return sum;
    }
    public static void main(String args[]){
        Multiply m=new Multiply();
        int result=m.mul(3,5);
        System.out.println(result);
    }
}
