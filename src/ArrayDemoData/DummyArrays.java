package ArrayDemoData;
import java.util.Scanner;
public class DummyArrays {
    public static void main(String[] args) {

    }
    public int[] getDummyArrayFromUser(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Size of Array");
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.println("Please enter the values in Array");
        for(int i = 0; i < sizeOfArray; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public int[] staticArray(){
        int[] arr = {1,4,7,3,3,4,5,79,5,2,2,4,6,7,9};
        return arr;
    }
    public int[] ststicSortedArray(){
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        return arr;
    }
    public void prinArray(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
