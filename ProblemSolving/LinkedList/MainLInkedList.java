public class MainLInkedList {
    public static void main(String[] args) {
        LinkedListPractice list= new LinkedListPractice();
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertLast(15);
        list.insertIndex(20, 3);
       // list.deleteAtStart();
       //list.deleteAtLast();
       //list.deleteIndex(2);
        System.out.println(list.find(3));
        list.display();
    }
}
