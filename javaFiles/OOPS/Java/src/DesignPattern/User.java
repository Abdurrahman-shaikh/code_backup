package DesignPattern;

public class User {
    public String name;
    int age;

    public User(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hey, My name is " + name);
        System.out.println("And I am "+ age + " years old");
    }
}
