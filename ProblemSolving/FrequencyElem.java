public class FrequencyElem {
    public static void main(String[] args) {
        int arr[]={2,3,3};

    }
    public static int count(int[] arr){
        int k=0,key;
        int count=0;
        int freq[]=new int[arr.length];
        for (int i = 0; i < freq.length; i++) {
            key =arr[i];
            for (int j = 1; j < freq.length; j++) {
                if(key==arr[i]){
                    count++;
                }

            }
            freq[i]=count;
        }
        return k;
    }

}
