package data.DynamicPrograming;

public class EditDistance {

    void main(){
        String s1 = "horse";
        String s2 = "ros";

        System.out.println();


    }
    public static int edit(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp= new int[m+1][n+1];
        for(int i=0;i<m;i++) dp[i][0]=i;
        for(int j=0;j<n;j++) dp[0][j]=j;









    }






}
