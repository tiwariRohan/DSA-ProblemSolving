import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {

        CustomHash<Integer> heap=new CustomHash<>();
        heap.insert(55);
        heap.insert(23);
        heap.insert(36);
        heap.insert(87);
        System.out.println(heap.remove());
    }
}