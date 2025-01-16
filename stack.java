//672110545 Virawit Kongthong ADT Tutorial 3

public class stack{
    private static int[] stackArray;
    private static int top;
    private static int capacity; 
        
    public stack(int capacityf) {
        capacity = capacityf;
        stackArray = new int[capacity];
        top = -1;
    }
        
    public void push(int element) {
        if (isFull()) {
        System.out.println("Stack overflow");
    } else {
        stackArray[++top] = element;
    }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
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

    public void peek() {
        System.out.println(stackArray[top]);
    }

    public static int capacity() {
        return capacity;
    }
}
