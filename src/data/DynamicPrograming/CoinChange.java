package data.DynamicPrograming;

public class CoinChange {
    /*
📌 Problem

You are given an array of coin denominations coins[] and an integer amount.

Return the minimum number of coins required to make that amount.
If it is not possible, return -1.

     */
    void main(){
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coin(coins, amount)); // Output: 3

    }

    public static int coin(int[] coins,int amount){
        int[] dp=new int[amount+1];
        for(int i=0;i<=amount;i++){
            dp[i]=amount+1;
        }
        dp[0]=0;

        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(i-coin>=0) {
                    dp[i] = Math.min(dp[i], dp[i - coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }








}
