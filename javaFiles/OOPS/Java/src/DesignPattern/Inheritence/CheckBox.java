package DesignPattern.Inheritence;

public class CheckBox extends UIControl {
    @Override
    public void enable() {
        super.enable();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a checkbox");
    }
}
