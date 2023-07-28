package DesignPattern.memento;

public class Editor{
    private String content;

//    Public EditorState createState(String CONTENT) {
//        return new EditorState(CONTENT);
//    }

    public void setContent(String content) {
        this.content = content;
        
    }

    public String getContent() {
        return content;

    }



    public EditorState restore(EditorState state) {
        return CONTENT = state.getCONTENT();
    }
}