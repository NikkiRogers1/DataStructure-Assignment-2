# Journal
Phase 1 -
If the changes are Change 1, Change 2, and Change 3, LIFO (Last In, First Out) is the correct behavior for an undo operation because it undoes the most recent change, which would be Change 3. Unlike FIFO (First In, First Out), which would undo the first change, Change 1.

Phase 2 -

When a user calls the undo() method and no changes have been made, trying to pop from an empty stack would throw an exception. The program checks if the stack is empty before trying to use pop(). If there are no changes to undo, it tells the user that there are no changes to undo and the current state remains blank. I handle this edge case in my code by using an if-else statement. If the undo stack is not empty, it pops the previous state; otherwise, it prints “No changes to undo.”
