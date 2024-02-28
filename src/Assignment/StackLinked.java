package Assignment;
import java.util.LinkedList;

class StackUsingLinkedList {

private LinkedList<Integer> list;

public StackUsingLinkedList() {
list = new LinkedList<>();
}

public void push(int value) {
list.addLast(value);
}

public int pop() {
if (list.isEmpty()) {
throw new IllegalStateException("Stack is empty");
}
return list.removeLast();
}

public static void main(String[] args) {
    
}
}




