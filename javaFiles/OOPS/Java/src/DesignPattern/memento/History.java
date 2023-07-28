package DesignPattern.memento;

import java.util.Stack;

public class History {
    private Stack<EditorState> stateStack = new Stack<>();
    public void push(EditorState state){
        stateStack.push(state);
    }
    public EditorState pop(){
        return stateStack.pop();
    }
}
