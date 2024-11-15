// StackDemo.java
public class StackMethods {

    // ArrayStack Implementation
    static class ArrayStack {
        private int[] stack;
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        public ArrayStack(int size) {
            stack = new int[size];
            capacity = size;
            top = -1;
        }

        // Push an element onto the stack
        public void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[++top] = value;
        }

        // Pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return stack[top--];
        }

        // Peek the top element of the stack without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack[top];
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Display stack elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("ArrayStack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // LinkedListStack Implementation
    static class LinkedListStack {
        private class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top;

        // Constructor to initialize the stack
        public LinkedListStack() {
            top = null;
        }

        // Push an element onto the stack
        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        // Pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }

        // Peek the top element of the stack without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == null;
        }

        // Display stack elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("LinkedListStack elements: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test ArrayStack
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.display();
        System.out.println("Popped from ArrayStack: " + arrayStack.pop());
        System.out.println("Top of ArrayStack: " + arrayStack.peek());

        // Test LinkedListStack
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        linkedListStack.display();
        System.out.println("Popped from LinkedListStack: " + linkedListStack.pop());
        System.out.println("Top of LinkedListStack: " + linkedListStack.peek());
    }
}
