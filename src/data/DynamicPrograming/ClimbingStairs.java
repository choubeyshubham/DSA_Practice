package data.DynamicPrograming;

public class ClimbingStairs {
    /*
📌 Problem

You are climbing a staircase with n steps.
Each time you can climb either 1 step or 2 steps.

Return the number of distinct ways to reach the top.

     */
    void main(){
        System.out.println(climb(5)); // Output: 8
    }
    public static int climb(int n){
        if(n<=2) return n;
        int fir=1;
        int sec=2;
        for(int i=3;i<=n;i++){
            int third=fir+sec;
            sec=fir;
            fir=third;
        }
        return sec;
    }




}
