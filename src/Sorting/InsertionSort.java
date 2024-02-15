package Sorting;

import ArrayDemoData.DummyArrays;

public class InsertionSort{
    public static void main(String[] args){
        InsertionSort mainObj = new InsertionSort();
        DummyArrays dummyArrays = new DummyArrays();
        int[] arr = dummyArrays.getDummyArrayFromUser();
        System.out.println("array inserted ");
        dummyArrays.prinArray(arr);
        int[] res = mainObj.insertionSort(arr);
        System.out.println("array after result");
        dummyArrays.prinArray(res);
    }
    int[] insertionSort(int[] numbs){

        int size = numbs.length;


        for(int i = 0;i < size;i++){
            int minNumber = numbs[i],minIndex = i;
            for(int j = i+1;j < size;j++){
                if(minNumber > numbs[j]){
                    minNumber = numbs[j];
                    minIndex = j;
                }
            }
                int temp = numbs[i];
                numbs[i] = numbs[minIndex];
                numbs[minIndex] = temp;
        }
        return numbs;
    }

}
