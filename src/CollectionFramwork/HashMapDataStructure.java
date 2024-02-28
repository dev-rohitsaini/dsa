package CollectionFramwork;

import ArrayDemoData.DummyArrays;

import java.util.HashMap;
import java.util.Map;

public class HashMapDataStructure {
    public static void main(String[] args) {
        HashMapDataStructure mainObj = new HashMapDataStructure();
        DummyArrays dummyArrays = new DummyArrays();
        int[] arr = dummyArrays.getDummyArrayFromUser();
        mainObj.countDuplicates(arr);

    }
    public void countDuplicates(int[] arr){
        int length = arr.length;
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();

        for(int i =0;i < length;i++){
            if(myMap.containsKey(arr[i])){
                int temp = myMap.get(arr[i]);
                myMap.put(arr[i],temp+1);
            }else {
                myMap.put(arr[i], 1);
            }
        }
        System.out.println(myMap.remove(2,3));
//        System.out.println(myMap);
        //itreate using for loop

        for(Map.Entry<Integer,Integer> entry: myMap.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

}
