public class StackMain {
    public static void main(String[] args) throws StackEexception{
        CustomStack stack=new CustomStack(5);

        stack.push(5);
        stack.push(56);
        stack.push(15);
        stack.push(8);
        stack.push(9);
        stack.push(3);
        stack.push(1);


        System.out.println(stack.peek());
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       
        
    }
}
