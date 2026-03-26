package data.Arrays;

public class SellStock {

    void main(){
        int[] price = {7, 1, 5, 3, 6, 4};

        System.out.println(stock(price));

    }

    public static int stock(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int price:arr){
            if(price<min){
                min=price;
            }else{
                int profit=price-min;
                max=Math.max(max,profit);
            }
        }
        return max;
    }



}
