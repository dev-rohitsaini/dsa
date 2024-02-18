package Sorting;

import ArrayDemoData.DummyArrays;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mainObj = new MergeSort();
        DummyArrays dummyArrays = new DummyArrays();
        int[] numbs = dummyArrays.getDummyArrayFromUser();
        System.out.println("Array Inserted -> ");
        dummyArrays.prinArray(numbs);
        int[] res = mainObj.mergeSort(numbs);
        System.out.println("Result after sorting -> ");
        dummyArrays.prinArray(res);

    }
        int[]  mergeSort(int[] arr){
            sort(arr,0, arr.length -1);
        return arr;
        }
        public static void sort(int[] arr, int left, int right){
        if(left < right){
            int middle = (left + right)/2;
            sort(arr, left, middle);
            sort(arr, middle+1,right);
            merge(arr,left, middle, right);
        }

        }
        public static void merge(int[] arr, int left,int middle,int right) {
            int n1 = middle - left +1;
            int n2 = right - middle;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            for(int i =0;i< n1;i++){
                leftArray[i] = arr[left+i];
            }
            for(int i =0; i< n2 ;i++){
                rightArray[i] = arr[middle + i + 1];
            }
            int i =0,j=0, k = left;
            while(i < n1 && j < n2){
                if(leftArray[i] <= rightArray[j]){
                    arr[k++] =  leftArray[i++];
                }else{
                    arr[k++] = rightArray[j++];
                }
            }
            while( i< n1){
                arr[k++] = leftArray[i++];
            }
            while(j < n2){
                arr[k++] = rightArray[j++];
            }
    }
}
