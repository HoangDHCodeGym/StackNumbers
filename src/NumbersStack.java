public class NumbersStack {
    private int size = 200;
    private int[] stack = new int[size];
    private int top = -1;

    public NumbersStack() {
    }

    public NumbersStack(int size) {
        this.size = size;
        this.stack = new int[size];
    }

    public int peak() {
        return this.stack[top];
    }

    public int pop() {
        if (top >= 0) {
            top -= 1;
            return this.stack[top+1];
        } else {
            System.out.println("No element to pop");
            return 0;
        }
    }

    public void push(int number) {
        top += 1;
        this.stack[top] = number;
    }

    public void empty() {
        top = -1;
    }

    public int getCount() {
        return top + 1;
    }
}
