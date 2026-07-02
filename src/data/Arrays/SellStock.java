package data.Arrays;

public class SellStock {

    void main(){
        int[] price = {7, 1, 5, 3, 6, 4};

        System.out.println(stock(price));//5

    }

    public static int stock(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int a:arr){
            if(a<min)  min=a;
            else       max=Math.max(max,a-min);
        }
        return max;
    }




}
