package DsaMediumQuestion;

import ArrayDemoData.DummyArrays;

import java.util.HashSet;

public class RepeatAndMissing {
    public static void main(String[] args) {
        DummyArrays dummyArrObj = new DummyArrays();
        int[] numbs = dummyArrObj.getDummyArrayFromUser();
        int[] res = checkRepeatedAndMissingNumber(numbs);
        dummyArrObj.prinArray(res);
    }
    //given array must be 1 to n with one repeated number and one missing number[3,1,2,5,3]
    // output should be an array wit missing and repeated number e.g. [3,4];
    static int[] checkRepeatedAndMissingNumber(int[] arr){
        int size = arr.length;
        int duplicateValue,missingValue;
        //Calculating sum of numbers present in array
        long sum = 0;
        for(int val :arr){
            sum+= val;
        }
        //sum till n numbers
        long nthSum = (long) size * (size+1)/2;
        //get difference
        long diff = nthSum - sum;
        duplicateValue = getDuplicate(arr,size);
        missingValue = (int) (duplicateValue + diff);
        return new int[]{duplicateValue, missingValue};
    }
    static int  getDuplicate(int[] arr,int size){
        HashSet<Integer> mySet = new HashSet<>();
        for(int i = 0; i < size; i++){
            if(mySet.contains(arr[i])){
                return arr[i];
            }else{
                mySet.add(arr[i]);
            }
        }
        return -1;
    }
}
