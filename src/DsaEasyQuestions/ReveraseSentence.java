package DsaEasyQuestions;

import java.util.Scanner;

public class ReveraseSentence {
    public static void main(String[] args) {
        System.out.println("Please enter the value of string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = resverTheWordsInSentences(str);
        System.out.println(res);

    }
    static String reverseTheSentence(String str){
        int sizeOfStirng = str.length() -1;
        String res= "";
        for(int i = sizeOfStirng ;i >= 0 ;i--){
                res += str.charAt(i);
        }
        return res;
    }
    public static String resverTheWordsInSentences(String str){
        String[] strArray =str.split(" ");
        int arraySize = strArray.length;
        StringBuilder res = new StringBuilder();
        String temp1 = "";
        for(int i =0;i < arraySize; i++){
           StringBuilder temp = new StringBuilder();
            int sizeOfString = strArray[i].length() - 1;
           for(int j = sizeOfString;j >= 0;j--){
               temp.append(strArray[i].charAt(j));
           }
           res.append((i == arraySize - 1) ? temp.toString() : temp + " ");
        }
        return res.toString();
    }
}
