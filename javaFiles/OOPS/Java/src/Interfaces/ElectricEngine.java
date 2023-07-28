package Interfaces;

public class ElectricEngine implements Engine {
    public void start(){
        System.out.println("ElectricEngine starts");
    }
    public void stop(){
        System.out.println("ElectricEngine stopss");
    }
    public void acc() {
        System.out.println("Electric engine accelerate");
    }
}
