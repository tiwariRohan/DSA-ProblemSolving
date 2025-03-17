
public class LL {
    //a node contains a value and a reference which  pointing to next node,
    // each node contains value and next 
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertAtFirst(int val){
        Node node=new Node(val);
        // node is an object of type node 
        
        node.next=head;
        head= node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }
    private class Node{
        private int value;
        private Node next;
        // need to make contructor 
        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;

        }
        
        
    }

    //reverse a list

    private void  reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }

        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
   
    public static void main(String[] args) {
        LL list= new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(8);
        list.insertAtFirst(2);
        list.insertAtFirst(5);
        list.insertAtFirst(7);
        list.insertAtFirst(9);
        list.display();
        System.out.println();
        // list.reverse();
        list.reverse(list.head);
        list.display();
        
    }
}

