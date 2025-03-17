public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }
    
    

    public Node getHead() {
        return head;
    }



    public void setHead(Node head) {
        this.head = head;
    }



    // insert at first
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            // look here is the doubt , the tail is pointing to the first inserted element
            // in the list
            // this first element will goes to the end hence the tail is pointing at last
            tail = head;
        }
        size += 1;
    }

    // insert at last of the list
    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }

        Node last = new Node(val);
        tail.next = last;
        tail = last;
        size++;

    }

    // insert at a particular index of the list
    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        // node.next=temp.next;
        temp.next = node;
        size++;
    }

    // delete at first
    public int deleteAtStart() {
        int val = head.value;
        head = head.next;
        if (head == tail) {
            tail = null;
        }
        size--;
        return val;
    }

    // delete at last
    public int deleteAtLast() {
        if (size <= 1) {
            return deleteAtStart();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // delete from given index
    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteAtStart();
        }
        if (index == size) {
            return deleteAtLast();
        }
        Node prevNode = get(index - 1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return val;
    }

    // to get from an index element
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // to find a element in the list
    public Node findNode(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // inserrt into recursion
    public void insertRec(int val, int index) {
        head = insertRecursively(val, index, head);
    }

    public Node insertRecursively(int val,int index, Node node){
        if(index==0){
            Node temp=new Node(val,node);
            temp.next=node;
            return temp;
        }
        node.next=insertRecursively(val, index-1, node.next);
        return node;
    }

        // question on linkedlist
        // remove duplicates frim list
        public void removeDuplicates() {
            Node node=head;
            while(node.next!=null){
                if(node.value==node.next.value){
                    node.next=node.next.next;
                    size--;
                }
                else{
                    node=node.next;
                }
            }
            tail=node;
            tail.next=null;
        }
        public static LinkedList mergingList(LinkedList list1, LinkedList list2){
            Node f=list1.head;
            Node s=list2.head;
            LinkedList ans=new LinkedList();
            while(f!=null&&s!=null){
                if(f.value<s.value){
                    ans.insertAtLast(f.value);
                    f=f.next;

                }
                else{
                    ans.insertAtLast(s.value);
                    s=s.next;
                }
            }
            while (f!=null) {
                ans.insertAtLast(f.value);
                f=f.next;
            }
            while (s!=null) {
                ans.insertAtLast(s.value);
                s=s.next;
            }
            return ans;
        }

        public static int cycleExist(LinkedList list){
            
            Node fast=list.head;
            Node slow=list.head;
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    int length=0;
                    Node temp=slow;
                    do{ 
                        temp=temp.next;
                        length++;
                    }while(temp!=slow);
                    return length;

                }
            }
            return 0;
        }
        // find middle element
        public int middleElement(LinkedList list){
            Node fast=list.head;
            Node slow=list.head;
            while (fast!=null&&fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow.value;
        }

        //sort the list
        public static void sortTheList(LinkedList list){
            Node node=list.head;
            while (node!=null&&node.next!=null) {
                if(node.value>node.next.value){
                    Node temp=node;
                    temp.next=node.next.next;
                    node=node.next;
                    node.next=temp;
                    node.next.next=temp.next;
                }
                else{
                    node=node.next;
                }
            }
        }
    //     public static void main(String[] args) {
    //         //given a sorted list 
    //     LinkedList list=new LinkedList();
    //     list.insertAtLast(1);
    //     list.insertAtLast(1);
    //     list.insertAtLast(4);
    //     // list.insertAtLast(2);
    //     list.insertAtLast(5);
    //     list.insertAtLast(3);
    //     list.insertAtLast(3);
    //     System.out.println(list.middleElement(list));
        
        
       
    //    // System.out.println(LinkedList.cycleExist(list));
        
    //     // LinkedList list2=new LinkedList();
    //     // list2.insertAtLast(1);
    //     // list2.insertAtLast(2);
    //     // list2.insertAtLast(3);
    //     // list2.insertAtLast(4);
    //     // list2.insertAtLast(5);
    //     // list2.insertAtLast(6);
        
    //     // LinkedList ans=LinkedList.mergingList(list, list2);
    //     // list.display();
    //     // list.removeDuplicates();
    //     // System.out.println("after removing duplicates");
    //     //list.insertRec(44, 3);
        
    //     // ans.display();
    //     }
}
