import java.util.Arrays;

public class SortColors {
    public static void main(String[] args){
    int [] nums={2,2,1,0,1,0};
    }
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
    }

