public class DoublyLL {
    private Node head;
    //private Node tail;
    //private int size;
    // public DoublyLL(){
    //     this.size=0;
    // }

    // now insert a node at first
    public void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head; 
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        // if(tail==null){
        //     tail=head;
        // }
       // size+=1;
    }
// insert at last 
    public void insertAtLast(int val){
        if(head==null){
            insertAtFirst(val);
            return;
        }
        Node tail=head;
        
        while(tail.next!=null){
            tail=tail.next;
        }
        Node node=new Node(val);
        tail.next=node;
        node.next=null;
        node.prev=tail;
       
    }

    // insert at node
    public void insertAtVal(int after, int val){
        // now temp have after value
        Node temp=find(after);
        if(temp==null){
            System.out.println("Node Does Not Exist");
            return;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        if(node.next!=null){
            node.next.prev=node;
        }
      
    }

    // find the element
    public Node find(int val){

        Node temp=head;
        while (temp!=null) {
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

// delete a node from the list
    public int deleteAtFirst(){
        if(head==null){
            System.out.println("list is empty");
            return -1;
        }
        int val=head.value;
        head=head.next;
        head.prev=null;
        return val;
    }

    //delete from the last
    public int deleteAtLast(){
        if(head==null){
            return -1;
        }
        if(head.next==null){
            return deleteAtFirst();
        }
        Node tail= head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        int val=tail.value;
        tail=tail.prev;
        tail.next=null;
        return val;
    }
    // let's delete from a index
    public int deleteFromVal(int after){
        Node indexNode=find(after);
        if(indexNode==null){
            System.out.println("node does not exist");
            return -1;
        }
        int val=indexNode.value;

        if (indexNode.prev != null) {
            indexNode.prev.next = indexNode.next;
        }
    
        // Update the next node's previous pointer
        if (indexNode.next != null) {
            indexNode.next.prev = indexNode.prev;
        }
        
        
        return val;

    }
// display element of the list
    public void display(){

        Node temp=head;
        Node node=null;
        while(temp!=null){
            System.out.print(temp.value+"->");
            node=temp;//to reverse the linked list
            temp=temp.next;
        }
        System.out.println("END");

        System.out.println("Reverse List");
        while(node!=null){
            System.out.print(node.value+"->");
            node=node.prev;
        }
        System.out.print("START");
    }

    //to create a node
    private class Node{
        private int value;
        private Node next;
        private Node prev;
       
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }

}
