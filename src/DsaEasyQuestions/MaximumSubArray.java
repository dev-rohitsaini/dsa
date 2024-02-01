package DsaEasyQuestions;
import ArrayDemoData.DummyArrays;

public class MaximumSubArray {
    public static void main(String[] args){
        MaximumSubArray mainObj =  new MaximumSubArray();
        DummyArrays obj = new DummyArrays();
        int[] arr = obj.getDummyArrayFromUser();
        int target = 6;
        System.out.println(mainObj.getMaxSum(arr));
    }
    int getMaxSum(int[] numbs){
        int currMax = numbs[0];
        int globalMax = numbs[0];
        for(int i=1;i<numbs.length; i++){
            currMax = Math.max(numbs[i], numbs[i] + currMax);
            globalMax = Math.max(globalMax, currMax);
        }
        return globalMax;
    }
    boolean hasMaximumSubArray(int[] numbs, int target){

        int currMax = numbs[0];
        int globalMax = numbs[0];
        int size = numbs.length;
        for(int i=0;i<size;i++){
            currMax = Math.max(numbs[i], currMax+numbs[i]);
            globalMax = Math.max(currMax, globalMax);
            if(globalMax == target)return true;
        }
        return false;
    }
}
