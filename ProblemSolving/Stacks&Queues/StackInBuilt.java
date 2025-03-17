import java.util.Stack;

public class StackInBuilt {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(21);
        stack.push(24);
        stack.push(62);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());
    }
}
