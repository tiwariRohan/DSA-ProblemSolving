public class LinkedSeries {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtFirst(4);
        list.insertAtFirst(7);
        list.insertAtFirst(3);
        list.insertAtFirst(9);
        list.insertAtFirst(11);
        // insert at last
        // list.insertAtLast(15);
        // list.insertAtIndex(25, 3);
        // list.deleteAtStart();
        // delete at last
        //System.out.println(list.deleteAtLast());
        //System.out.println(list.deleteAtIndex(2));

        System.out.println(list.findNode(3));
        list.display();
    }
}
