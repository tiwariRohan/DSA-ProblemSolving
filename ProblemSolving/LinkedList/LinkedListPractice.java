public class LinkedListPractice {
    private Node head;
    private Node tail;
    private int size;
    public LinkedListPractice(){
        this.size=0;
    }

    //Now insert values
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;// head is a node in itself
        head=node;
        if (tail==null) {
            tail=head;
        }
        size+=1;
    }
// insert at last
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        size+=1;
    }
// insert at particular index;
    public void insertIndex(int val,int index){
        if(index<=0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node secondNode=get(index-1);
        Node node=new Node(val,secondNode.next);
        secondNode.next=node;
        size+=1;
        
    }
// get function to get node
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
// now deleting the elements
    public int deleteAtStart(){
        int value=head.value;
        head=head.next;
        if(head==tail){
            tail=null;
        }
        size--;
        return value;
    }
//now delete from last
    public int deleteAtLast(){
        if(size<=1){
            return deleteAtStart();
        }
        int val=tail.value;
        Node prevNode=get(size-2);
        tail=prevNode;
        tail.next=null;
        size--;
        return val;
    }

// delete from index
    public int deleteIndex(int index){
        if(index==0){
            return deleteAtStart();
        }
        if(index==size){
            return deleteAtStart();
        }
        Node prevNode=get(index-1);
        int val=prevNode.next.value;
        prevNode.next=prevNode.next.next;
        size--;
        return val;
    }
// find a Node
    public Node find(int val){
        Node temp=head;
        while (temp!=null) {
            if (temp.value==val) {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    // display the created list
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }




    //To make nodes we use class Node
    // Every node have a value
    // Every Node points to the next node that's why next is defined
    private class Node {
        private int value;
        private Node next;

    // make constructor to initialise these values in it
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        
    }
}
