import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        // Scanner scanner =new Scanner(System.in);
        // BinaryTree btree=new BinaryTree();
        // btree.populate(scanner);
        // btree.display();
        // btree.preetyDisplay();

        BST binaryTree=new BST();
        int[] nums={13,5,6,12,15,14,9,10};
        binaryTree.populate(nums);
        binaryTree.display();
    }
}
