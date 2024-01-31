package ArrayDemoData;
import java.util.Scanner;
public class DummyArrays {
    public static void main(String[] args) {

    }
    public int[] getDummyArrayFromUser(int size){
       Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Please enter the values in Array");
        for(int i = 0; i < size; i++){
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
