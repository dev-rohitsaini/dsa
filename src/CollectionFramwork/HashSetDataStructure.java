package CollectionFramwork;

import ArrayDemoData.DummyArrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetDataStructure {
    public static void main(String[] args) {
        HashSetDataStructure mainObj = new HashSetDataStructure();
        DummyArrays dummyArrays = new DummyArrays();
        int[] arr = dummyArrays.getDummyArrayFromUser();
        mainObj.removeDuplicates(arr);
    }

    public void removeDuplicates(int[] arr){
        int length = arr.length;
        HashSet<Integer> mySet = new HashSet<Integer>();
        for(int i =0;i < length;i++ ){
            mySet.add(arr[i]);
        }
//        System.out.println(mySet);
        Iterator<Integer> iterable =  mySet.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }

//        for(int val:mySet){
//            System.out.println(val);
//        }

    }
}
