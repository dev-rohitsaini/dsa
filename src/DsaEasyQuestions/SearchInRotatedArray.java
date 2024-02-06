package DsaEasyQuestions;

import ArrayDemoData.DummyArrays;
import Searching.SearchInSortedArray;

import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchInRotatedArray mainObj = new SearchInRotatedArray();
        DummyArrays dummyArrObj  = new DummyArrays();
        int [] nums = dummyArrObj.getDummyArrayFromUser();
        System.out.println("Please enter the target value ");
        int target = sc.nextInt();
        boolean res = mainObj.getElement(nums,target);
        System.out.println("the result is "+res);
    }

    boolean getElement(int[] arr,int target){
        int si = 0,ei = arr.length - 1;
        while(si <= ei){
            int mid = (ei + si)/2;
            if(arr[mid] == target ) return true;
            else if(arr[mid] > target){
                if(arr[ei] > target)si = mid + 1;
                else ei = mid - 1;
            }
            else{
                if(arr[si] < target)ei = mid - 1;
                else si = mid + 1;
            }
        }
        return false;
    }
}
