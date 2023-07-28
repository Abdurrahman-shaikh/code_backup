package Inheritence;
public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dog {
    public void play() {
        System.out.println("Puppy is playing.");
    }
}


