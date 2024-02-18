package Sorting;

import ArrayDemoData.DummyArrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort mainObj = new QuickSort();
        DummyArrays dummyArrays = new DummyArrays();
        int[] numbs = dummyArrays.getDummyArrayFromUser();
        System.out.println("Array Inserted -> ");
        dummyArrays.prinArray(numbs);
        int[] res = mainObj.quickSort(numbs);
        System.out.println("Result after sorting -> ");
        dummyArrays.prinArray(res);
    }

    int[] quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }
    void sort(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr,low, high);
            sort(arr, low, pivot -1);
            sort(arr, pivot +1,high);
        }
    }
    int partition(int[] arr, int low, int high){
        int pivotValue = arr[high];
        int i =low -1;
        for(int j = low; j< high;j++){
            if(arr[j] < pivotValue){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr,i+1,high);
        return i + 1;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

}