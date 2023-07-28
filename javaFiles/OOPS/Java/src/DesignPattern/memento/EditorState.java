package DesignPattern.memento;

public class EditorState{
    private final String CONTENT;
    public String getCONTENT() {
        return CONTENT;
    }
    public EditorState(String content) {
        this.CONTENT = content;
    }

}
