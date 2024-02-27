package Searching;
import ArrayDemoData.DummyArrays;
import java.util.Scanner;

public class SearchInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchInSortedArray mainObj = new SearchInSortedArray();
        DummyArrays dummyArrObj = new DummyArrays();
        int[] arr = dummyArrObj.getDummyArrayFromUser();
        System.out.println("Please enter the target value");
        int target = sc.nextInt();
        System.out.println(mainObj.isElementPresent(arr,target));
    }
    boolean isElementPresent(int[] arr, int target){
       int si = 0;
       int ei = arr.length - 1;
       while(si < ei){
           int mid = (si + ei)/2;
           if(arr[mid] == target)return true;
           else if(arr[mid] > target) si = mid + 1;
           else ei = mid -1;
       }
        return false;
    }
}
