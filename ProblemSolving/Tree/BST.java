public class BST {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public  Node(int value){
            this.value=value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;
    public BST(){

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
       
        return root==null;
    }

    public void insert(int value){
        root=insert(value, root);
    }

    public Node insert(int value ,Node node){

        if(node==null){
            node=new Node(value);
            return node; 
        }
        if(value<node.value){
            node.left= insert(value, node.left);
        }
        if(value>node.value){
            node.right=insert(value, node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    public boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(height(node.left)-height(node.right))<=1&& balanced(node.left)&&balanced(node.right);
    }

    public void display(){
        display(this.root,"root node:");
    }
    private void display(Node node,String detail){
        if(node==null){
            return;
        }
        System.out.println(detail+node.value);
        display(node.left,"left child of " +node.value+":");
        display(node.right,"right child of " +node.value+":");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
          this.insert(nums[i]);
        }
    }
    
      public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }
    
      private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
          return;
        }
    
        int mid = (start + end) / 2;
    
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
      }

      public void preOrder(){
        preOrder(root);
      }

      private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
      }
      private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
      }

      private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
      }
}
