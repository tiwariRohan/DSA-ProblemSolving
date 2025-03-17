public class FindDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]!=i){
            if(nums[i]<nums.length&& nums[i]!=nums[correct]){
                swap(nums,i,correct);
            } else return true;
            }
            else i++;
            
        }
        return false;
    }
     static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={0};
        System.out.println(containsDuplicate(arr));
    }
}
