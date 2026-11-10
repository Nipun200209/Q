
class Stack {

    int stack[] = new int[5];
    int top = -1;

    // Push Operation
    void push(int data) {

        if (top == 4) {
            System.out.println("Stack Overflow");
        } 
        else {
            top++;
            stack[top] = data;
        }
    }

    // Pop Operation
    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
        } 
        else {
            System.out.println("Deleted: " + stack[top]);
            top--;
        }
    }

    // Peek Operation
    void peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } 
        else {
            System.out.println("Top Element: " + stack[top]);
        }
    }

    // Display Operation
    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } 
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack Elements:");
        s.display();

        s.peek();

        s.pop();

        System.out.println("After Pop:");
        s.display();
    }
}
