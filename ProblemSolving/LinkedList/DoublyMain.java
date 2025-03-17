public class DoublyMain {
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.insertAtFirst(5);
        list.insertAtFirst(2);
        list.insertAtFirst(9);
        list.insertAtFirst(4);
        list.insertAtFirst(1);
        list.insertAtLast(15);
        list.insertAtVal(2, 25);//to insert after a value
        System.out.println("before deleting element");
        list.display();
        
       // System.out.println( "after deleting element");
       // System.out.println(list.deleteAtFirst());
    //    System.out.println(list.deleteAtLast());
    System.out.println();
        System.out.println(list.deleteFromVal(4));
        list.display();
    }
}
