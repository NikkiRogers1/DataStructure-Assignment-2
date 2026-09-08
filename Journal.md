# Journal
Phase 1 -
If the changes are Change 1, Change 2, and Change 3, LIFO (Last In, First Out) is the correct behavior for an undo operation because it undoes the most recent change, which would be Change 3. Unlike FIFO (First In, First Out), which would undo the first change, Change 1.

Phase 2 -

When a user calls the undo() method and no changes have been made, trying to pop from an empty stack would throw an exception. The program checks if the stack is empty before trying to use pop(). If there are no changes to undo, it tells the user that there are no changes to undo and the current state remains blank. I handle this edge case in my code by using an if-else statement. If the undo stack is not empty, it pops the previous state; otherwise, it prints “No changes to undo.”


Phase 3 -

The redoStack must be cleared so that the new changes can be saved and the old redo history does not mess with the new changes. Once a user makes a brand new change, the previous redo history is no longer valid.


Phase 4-

This last phase I made a test scenario using 4 words: Dog, Cat, Ferret, and Fox. I traced the exact content of both the undo stack and the redo stack after each step. The first step was makeChange() Dog. The undo stack contains [""] because that was at the beginning of the EditorHistory, and the redo stack is [] because there is nothing to redo.
Then Cat was added. The undo stack then contains ["", "Dog"], and the redo stack is still [] because there is still nothing to redo. The next step is makeChange() Ferret. The undo stack contains ["", "Dog", "Cat"]. The redo stack is still [] because nothing was undone yet.
The next step is undo. Now the redo stack changed, and the undo stack contains ["", "Dog"] because Cat is now the new current state. The redo stack contains ["Ferret"] because Ferret was the current state before the undo, and Cat was popped off the undo stack and became the current state.
The next undo then makes the undo stack contain [""], and Dog is popped off the undo stack and becomes the current state. The redo stack contains ["Ferret", "Cat"].
The next step is redo, so the undo stack contains ["", "Dog"] and the redo stack contains ["Ferret"]. Cat becomes the current state.
The next step is to add a new makeChange() with Fox. The undo stack then contains ["", "Dog", "Cat"], and the redo stack is [] because when you add a new makeChange(), it clears the redo stack.
Then for the last step, it asked to do a redo attempt, but because during the last makeChange() it clears the redo stack, there is nothing to redo.
