package ArrayDemoData;
import java.util.Scanner;
public class DummyArrays {
    public static void main(String[] args) {

    }
    int[] getDummyArrayFromUser(int size){
       Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
