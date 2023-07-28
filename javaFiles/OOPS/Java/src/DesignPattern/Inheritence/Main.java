package DesignPattern.Inheritence;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.enable();
        draw(new TextBox());
    }
    public static void draw(@NotNull UIControl control){
        control.draw();
    }
}
