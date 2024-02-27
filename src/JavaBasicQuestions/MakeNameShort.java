package JavaBasicQuestions;

import ArrayDemoData.DummyArrays;

public class MakeNameShort {
    public static void main(String[] args) {
        MakeNameShort mainObj = new MakeNameShort();
        DummyArrays dummyArrays = new DummyArrays();
        String input = dummyArrays.getStringFromUser();
        String res = mainObj.makeNameShortWithContantSpace(input);
        System.out.println(res);


    }
    public String makeShortName(String str){
        String res = "";
        String[] temp = str.split(" ");
        int n = temp.length;
        for(int i = 0;i<n;i++){
            if(i == n-1){
                res += temp[i];
            }else{
                res = res + temp[i].charAt(0) + "." +" ";
            }
        }
        return res;
    }

    public String makeNameShortWithContantSpace(String input){
        String res = "";
        String str = input.trim();
        int lenthOfString = str.length()-1;
        String tempLastName = "";
        //Get Last name
        while(lenthOfString >= 0 && str.charAt(lenthOfString) != ' '){
            tempLastName += str.charAt(lenthOfString);
        lenthOfString--;
        }
        String lastName = "";
        // Reverse the output from lastname
        for(int i = tempLastName.length()-1;i >= 0;i-- ){
            lastName += tempLastName.charAt(i);
        }

        lenthOfString = str.length()-1;
        for(int i = 0; i < lenthOfString - lastName.length(); i++){
            if(i == 0){
                res += str.charAt(i) + "." + " ";
            }else if(str.charAt(i - 1) == ' '){
                res = res + "." + " ";
            }
        }

        return res + lastName;
    }

}
