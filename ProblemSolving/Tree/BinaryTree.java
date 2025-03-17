import java.util.Scanner;

public class BinaryTree {
     
    public BinaryTree(){

    }

    private static class Node{
         int value;
         Node left;
         Node right;

        public Node(int value){
            this.value=value;
        }

    }

    private Node root;

    //insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root element:");
        int value= scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    public  void populate(Scanner scanner, Node node){
        System.out.println("do you want to insert in left of "+node.value+":");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter left elemnt in "+node.value+":");
            int value= scanner.nextInt();
            // this left function is of the node element 
            node.left=new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("do you want to insert in right of "+node.value+":");
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter right elemnt in "+node.value+":");
            int value= scanner.nextInt();
            // this left function is of the node element 
            node.right=new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void preetyDisplay(){
        preetyDisplay(root,0);
    }
 
    private void preetyDisplay(Node node,int level){
        if(node==null){
            return;
        }

        preetyDisplay(node.right, level+1);

        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }
        else{
            System.out.println(node.value);
        }

        preetyDisplay(node.left, level+1);
    }
}
