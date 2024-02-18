package DsaMediumQuestion;

import ArrayDemoData.DummyArrays;

import java.util.Scanner;

public class FindKthLargestElement {
    public static void main(String[] args) {
        FindKthLargestElement mainObj = new FindKthLargestElement();
        DummyArrays dummyArrays = new DummyArrays();
        int[] nums = dummyArrays.getDummyArrayFromUser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleasse enter the kth element");
        int target = sc.nextInt();
        int result = mainObj.quickSelect(nums,target);
        System.out.println("the result is "+ result);
    }
    public int quickSelect(int[] arr,int k){
    int res = sort(arr, 0, arr.length - 1,arr.length - k);
        return res;
    }
    public static int sort(int[] arr, int low, int high, int k){
            int pivot = partition(arr,low,high);
            if(pivot == k){
                return arr[pivot];
            }else if(pivot > k){
                return sort(arr, low,pivot - 1,k);
            }else{
                return sort(arr,pivot + 1,high,k);
            }
    }
    public static int partition(int[] arr, int low, int high){
        int pivotValue = arr[high];
        int i = low -1;
        for(int j = low;j < high;j++){
            if(arr[j] < pivotValue){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
