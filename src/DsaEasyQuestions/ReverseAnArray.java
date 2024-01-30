package DsaEasyQuestions;
import ArrayDemoData.DummyArrays;

public class ReverseAnArray {
    public static void main(String[] args){
        ReverseAnArray obj = new ReverseAnArray();
        DummyArrays obj2 = new DummyArrays();
        int[]  nums = obj2.ststicSortedArray();
        obj2.prinArray(nums);
        System.out.println("REsult in next line");
        int[] reversedAray = obj.reverseArray(nums);
        obj2.prinArray(reversedAray);
    }
    int[] reverseArray(int[] nums){
        ReverseAnArray obj = new ReverseAnArray();
        int size = nums.length;
        for(int i = 0; i < size/2; i++){
            obj.swap(nums, i, size-1-i);
        }
        return nums;
    }
    int[] swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}
