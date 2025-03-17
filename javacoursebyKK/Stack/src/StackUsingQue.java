import java.util.*;

public class StackUsingQue {
    Queue<Integer> queue=new LinkedList<>();


    public void push(int x){

        queue.add(x);
        for(int i=0;i< queue.size()-1;i++){

            queue.add(queue.remove());
        }
    }
    public int pop() {
        return queue.remove();
    }

    boolean isEmpty(){
            return queue.isEmpty();
    }

    int size(){
        return queue.size();
    }

    public int peek(){
        return queue.peek();
    }
    public static void main(String[] args) {
        StackUsingQue obj=new StackUsingQue();
        obj.push(5);
        obj.push(4);
        obj.push(1);
        obj.push(3);

        System.out.println(obj.pop());
        System.out.println(obj.peek());
    }

}
