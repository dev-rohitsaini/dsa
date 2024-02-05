package Sorting;
import ArrayDemoData.DummyArrays;
public class BubbleSort {
    public static void main(String[] args){
        DummyArrays obj = new DummyArrays();
        BubbleSort mainBubbleSortObj = new BubbleSort();
        int[] nums = obj.getDummyArrayFromUser();
        int[] res = mainBubbleSortObj.intBubbleSort(nums);
        obj.prinArray(res);
    }
    public int[] intBubbleSort(int[] arr){
        BubbleSort obj = new BubbleSort();
        int size = arr.length;
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        obj.swap(arr,j,j+1);
                    }
            }
        }
        return arr;
    }

    public void swap(int[] arr,int i,int j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
         return;
    }
}
