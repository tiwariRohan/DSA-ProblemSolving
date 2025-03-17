public class StackMain {
    public static void main(String[] args) throws StackException{

        StackImplement Customstack=new StackImplement();
        Customstack.push(4);
        Customstack.push(5);
        System.out.println(Customstack.pop());
    }
}
