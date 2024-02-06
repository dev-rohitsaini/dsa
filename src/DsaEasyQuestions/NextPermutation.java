package DsaEasyQuestions;

import ArrayDemoData.DummyArrays;

public class NextPermutation {
    public static void main(String[] args) {
        NextPermutation mainObj = new NextPermutation();
        DummyArrays dummyArrObj = new DummyArrays();
        int[] nums = dummyArrObj.getDummyArrayFromUser();
        System.out.println("the inserted array is -> ");
        dummyArrObj.prinArray(nums);
        int[] res = mainObj.nextPermutationArray(nums);
        System.out.println("the result is -> ");
        dummyArrObj.prinArray(res);

    }
    int[] nextPermutationArray(int[] arr){
        int size = arr.length;
        for(int i = size-1;i > 0;i--){
            if(arr[i] > arr[i-1]){
                swapArr(arr, i, i-1);
                return arr;
            }
        }
        return arr;
    }
    static void swapArr(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
