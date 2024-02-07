package DsaMediumQuestion;

import ArrayDemoData.DummyArrays;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args){
        int maxProfit = getMostProfit();
        System.out.println("The maximum profit eraned is "+maxProfit);
    }
    static int getMostProfit(){
        DummyArrays dummyArrObj = new DummyArrays();
        int[] arr = dummyArrObj.getDummyArrayFromUser();
        int profit = 0,minValue = arr[0];
        int size = arr. length;
        for(int i = 0;i < size;i++){
            minValue = Math.min(arr[i], minValue);
            profit =Math.max(profit, arr[i] - minValue);
        }
        return profit;
    }
}
