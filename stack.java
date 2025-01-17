//672110545 Virawit Kongthong ADT Tutorial 3

public class stack{
    private static studentClass[] stackArray;
    private static int top;
    private static int capacity; 
        
    public stack(int capacityf) {
        capacity = capacityf;
        stackArray = new studentClass[capacity];
        top = -1;
    }
        
    public void push(studentClass element) {
        if (isFull()) {
        System.out.println("Stack overflow");
    } else {
        stackArray[++top] = element;
    }
    }

    public studentClass pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public studentClass peek() {
        return stackArray[top];
    }

    public int max() {
        return top + 1;
    }

    public static int capacity() {
        return capacity;
    }
}
