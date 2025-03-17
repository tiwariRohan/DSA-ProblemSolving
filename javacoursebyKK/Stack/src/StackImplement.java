

public class StackImplement {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public StackImplement() {
        this(DEFAULT_SIZE);
    }

    // when size of stack is passed while define
    public StackImplement(int size) {
        this.data = new int[size];

    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        ptr += 1;
        data[ptr] = item;
    }

    public int pop() throws StackException {
        if (isEmputy()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return data[ptr--];

    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmputy() {
        return ptr == -1;
    }

    public int peek() throws StackException {
        if (isEmputy()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }
}
