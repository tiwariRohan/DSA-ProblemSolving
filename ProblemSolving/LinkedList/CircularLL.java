public class CircularLL {
    private Node head;
    private Node tail;
    public CircularLL(){
        this.head=null;
        this.tail=null;
    }
    public void insertIn(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        
        tail.next=node;
        node.next=head;
        tail=node;

    }
    public void delete(int val){
        Node node=head;

        if(node==null){
            return;
        }
        if(node.value==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.value==val){
                node.next=n.next;
                break;
            }
            node=node.next;

        }while(node!=head);
    }
    public void display(){
        Node temp=head;
        if(head!=null){
        do{
           // 
            System.out.print(temp.value+"->");
            temp=temp.next;
        }while(temp!=head);
    }


    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node (int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.insertIn(11);
        list.insertIn(4);
        list.insertIn(54);
        list.insertIn(23);
        list.insertIn(3);
        list.insertIn(8);
        list.delete(54);
        list.display();
    }

}
