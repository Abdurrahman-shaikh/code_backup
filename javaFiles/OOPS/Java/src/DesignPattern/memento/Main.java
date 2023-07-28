package DesignPattern.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.setContent("d");

        System.out.println(editor.getContent());
    }
}
