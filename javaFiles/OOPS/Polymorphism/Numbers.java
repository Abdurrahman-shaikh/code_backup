public class Numbers {
    
    int sum(int a, int b){
        int c = a + b;
        return c;
    }
    float sum(int a, float b){
        float c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Numbers number = new Numbers();
        System.out.println(number.sum(2,34));
        System.out.println(number.sum(2,34.2f));
    }
}
