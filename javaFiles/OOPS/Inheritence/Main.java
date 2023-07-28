package Inheritence;
public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        Box box1 = new Box(box);
        BoxWeight box2 = new BoxWeight();
        Box b1 = new BoxWeight();
        BoxPrice b2 = new BoxPrice();
        System.out.println(box1.h+" "+box1.w+" "+box1.l);
        System.out.println(box2.h+" "+box2.w+" "+box2.l);
        System.out.println(b2.h+" "+b2.w+" "+ " "+b2.l +" "+ b2.weight +" "+ b2.cost);
    }
}
