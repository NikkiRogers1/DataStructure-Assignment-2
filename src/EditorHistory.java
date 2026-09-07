import java.util.Stack;

public class EditorHistory {
        
    String currentState = "";
       
    Stack<String> undoStack = new Stack<>();

    public void makeChange(String newState) {
        undoStack.push(currentState);
        currentState = newState;

    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            currentState = undoStack.pop();
        } else {
            System.out.println("No changes to undo.");
        }
    }

}


