package DsaEasyQuestions;
import ArrayDemoData.DummyArrays;
import Sorting.BubbleSort;

import java.util.Scanner;


public class ChocoDistributionProblem {
    public static void main(String[] args){
        maintainClasses();
    }
    public static void maintainClasses(){
        DummyArrays dummyObj = new DummyArrays();
        BubbleSort sortArrObj = new BubbleSort();
        ChocoDistributionProblem mainObj = new ChocoDistributionProblem();
        Scanner sc = new Scanner(System.in);
        //get array from user;---------------------------------
        int[] arr = dummyObj.getDummyArrayFromUser();;
        //sort the array---------------------------------------
        int[] sortedArray = sortArrObj.intBubbleSort(arr);
//        dummyObj.prinArray(sortedArray);
//        return;
        //get required output from user------------------------
        System.out.println("Please enter the number of childern");
        int numOfChildern = sc.nextInt();
        int res = mainObj.getMinValueBySliding(sortedArray, numOfChildern);
        System.out.println("the min diffrence between packets is "+res);


    }
    public int getMinValueBySliding(int[] numbs,int personCount){
        int currMin = Integer.MAX_VALUE,size = numbs.length,globalMin = Integer.MAX_VALUE;
        for(int i = 0;i < size - personCount; i++){
            currMin = Math.min(currMin, numbs[i+personCount-1] - numbs[i]);
            globalMin = Math.min(currMin,globalMin);
        }
        return globalMin;
    }

}
