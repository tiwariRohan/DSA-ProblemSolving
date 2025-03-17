public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack(){

        //using this with a parenthesis will call the constructor 
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    // push elements into stack
    public boolean push(int value){
        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=value;
        return true;
        }

    public int pop() throws StackEexception{
        if(isEmpty()){
            throw new StackEexception("cannot pop from empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws StackEexception{
        if(isEmpty()){
            throw new StackEexception("cannot peek in an empty stack");
        }
        return data[ptr];
    }
    protected boolean isFull(){
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }



}
