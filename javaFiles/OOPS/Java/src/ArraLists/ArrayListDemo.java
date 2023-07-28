package ArraLists;

public class ArrayListDemo {

    private int DEFAULT_SIZE = 10;
    private int[] arr;
    private static int size = 0;

    public ArrayListDemo() {
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int value) {
        if(isFull()){
            resize();
        }
        arr[size++] = value;
    }
    void resize(){
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public boolean isFull(){
        return size == arr.length;
    }
    public int get(int index){
        return arr[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.toString();
    }

    public void set(int index, int value){
        arr[index] = value;
    }
    public static void main(String[] args) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        arrayListDemo.add(1);
        arrayListDemo.add(2);
        arrayListDemo.add(3);
        arrayListDemo.add(4);
        arrayListDemo.add(5);
        arrayListDemo.add(6);
        arrayListDemo.add(7);
        arrayListDemo.add(8);
        arrayListDemo.add(9);
        arrayListDemo.add(10);
        arrayListDemo.add(11);
        arrayListDemo.add(12);
        arrayListDemo.add(13);
        arrayListDemo.add(14);
        arrayListDemo.add(15);
        arrayListDemo.add(16);
        arrayListDemo.add(17);
        arrayListDemo.add(18);
        arrayListDemo.add(19);
        arrayListDemo.add(20);
        arrayListDemo.add(21);
        arrayListDemo.add(22);
        arrayListDemo.set(3,54);
        System.out.println(arrayListDemo);
        System.out.println(arrayListDemo.get(7));
        System.out.println(arrayListDemo.toString());
        System.out.println(arrayListDemo.isFull());
    }
}
