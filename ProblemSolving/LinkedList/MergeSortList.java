public class MergeSortList {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        list1.insertAtLast(4);
        list1.insertAtLast(5);

        list2.insertAtLast(1);
        list2.insertAtLast(5);
        list2.insertAtLast(6);
        list2.insertAtLast(7);
        list2.insertAtLast(8);

        LinkedList ans=LinkedList.mergingList(list1, list2);
        
        ans.display();
    }
}
