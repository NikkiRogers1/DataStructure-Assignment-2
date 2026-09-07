import java.util.Stack;

public class EditorHistory {
        
    String currentState = "";
       
    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

    public void makeChange(String newState) {
        undoStack.push(currentState);
        redoStack.clear(); // Clear the redo stack when a new change is made
        currentState = newState;

    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentState);
            currentState = undoStack.pop();
        } else {
            System.out.println("No changes to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentState);
            currentState = redoStack.pop();
        } else {
            System.out.println("No changes to redo.");
        }
        
    }

}


