package DsaEasyQuestions;
import ArrayDemoData.DummyArrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args){
        DummyArrays obj = new DummyArrays();
        ContainsDuplicate mainObj = new ContainsDuplicate();
        int[] arr = obj.getDummyArrayFromUser();
        boolean result = mainObj.hasDuplicate(arr);
        System.out.print(result);

    }
    boolean hasDuplicate(int[] nums){
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int val:nums){
            if(myMap.containsKey(val)){
                return true;
            }else{
                myMap.put(val,1);
            }
        }
        return false;
    }
}
