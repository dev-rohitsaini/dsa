package DsaEasyQuestions;
import ArrayDemoData.DummyArrays;

public class MinMaxInArray {
    public static void main(String[] args){
        DummyArrays obj = new DummyArrays();
        MinMaxInArray obj2 = new MinMaxInArray();
        int[] arr = obj.staticArray();
        int[] res = obj2.minAndMaxValue(arr);
        System.out.print("The maximum value is "+res[1]+" and minimum value in array is "+res[0]);

    }
    int[] minAndMaxValue(int[] nums){
        int[] minMaxValue = new int[]{nums[0], nums[0]};
        for (int num : nums) {
            if (minMaxValue[0] > num) {
                minMaxValue[0] = num;
            }
            if (minMaxValue[1] < num) {
                minMaxValue[1] = num;
            }
        }
        return minMaxValue;
    }

}
