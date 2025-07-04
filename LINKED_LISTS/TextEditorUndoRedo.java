package DSA.LINKED_LISTS;

public class TextEditorUndoRedo {
    static class TextState {
        String content;
        TextState next, prev;

        TextState(String content) {
            this.content = content;
        }
    }

    TextState current = null;
    int maxHistory = 10;
    int size = 0;

    void addState(String text) {
        TextState node = new TextState(text);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
        size++;
        trimHistory();
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        } else {
            System.out.println("No more undo possible.");
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        } else {
            System.out.println("No more redo possible.");
        }
    }

    void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Document is empty.");
        }
    }

    void trimHistory() {
        int count = 0;
        TextState temp = current;
        while (temp != null) {
            count++;
            temp = temp.prev;
        }
        if (count > maxHistory) {
            TextState oldest = current;
            while (count > maxHistory) {
                oldest = oldest.prev;
                count--;
            }
            if (oldest.prev != null) {
                oldest.prev.next = null;
                oldest.prev = null;
            }
        }
    }

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!!!");
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}

