import org.w3c.dom.Node;

public class SortLinkedList extends LinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtLast(3);
        list.insertAtLast(1);
        list.insertAtLast(12);
        list.insertAtLast(17);
        list.insertAtLast(19);
        list.insertAtLast(8);
        LinkedList.sortTheList(list);
        list.display();
    }

    // public static LinkedList mergingList(LinkedList list1, LinkedList list2){
    //     Node f=list1.getHead;
    //     Node s=list2.getHead();
    //     LinkedList ans=new LinkedList();
    //     while(f!=null&&s!=null){
    //         if(f.value<s.value){
    //             ans.insertAtLast(f.value);
    //             f=f.next;

    //         }
    //         else{
    //             ans.insertAtLast(s.value);
    //             s=s.next;
    //         }
    //     }
    //     while (f!=null) {
    //         ans.insertAtLast(f.value);
    //         f=f.next;
    //     }
    //     while (s!=null) {
    //         ans.insertAtLast(s.value);
    //         s=s.next;
    //     }
    //     return ans;
    // }
    //  public int middleElement(LinkedList list){
    //         Node fast=list.getHead;
    //         Node slow=list.getHead();
    //         while (fast!=null&&fast.next!=null) {
    //             slow=slow.next;
    //             fast=fast.next.next;
    //         }
    //         return slow.value;
    //     }
   
}
