package DsaEasyQuestions;
import ArrayDemoData.DummyArrays;

public class SlidingWindow {
    public static void main(String[] args){
        DummyArrays obj = new DummyArrays();
        SlidingWindow mainObj = new SlidingWindow();
        int[] arr = obj.getDummyArrayFromUser();
        int k = 2;
        int res = mainObj.getTargetSumInKthSubArray(arr, k);
        System.out.println("The maximum sum in span of "+k+" length "+res);
    }
    int getTargetSumInKthSubArray(int[] numbs,int target){

        int size = numbs.length;
        int currSum = 0;
        int maxSum = 0;

        for(int i = 0;i < target;i++){
            currSum += numbs[i];
        }

        for(int j = target;j < size;j++){
            currSum += numbs[j] - numbs[j-target];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;

    }
}
