import java.util.Arrays;
import java.util.Stack;

public class SortStack{

    public static void main(String[] args) {
        Stack<Integer> sort= new Stack<>();
        sort.push(3);
        sort.push(2);
        sort.push(1);
        sort.push(14);
        sort.push(18);
        sort.push(12);
        sort.push(1);
        Stack<Integer> s= sort(sort);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
        int[] arr=new int[s.size()];
        int i=0;
		while(!s.isEmpty()){
            arr[i]=s.pop();
            i++;
        }
        //Arrays.sort(arr);
        i=0;
        while (i<arr.length) {
            s.push(arr[i]);
            i++;
        }
        return s;
	}
}