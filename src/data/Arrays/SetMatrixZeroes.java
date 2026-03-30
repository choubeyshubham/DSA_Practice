package data.Arrays;

import java.util.Arrays;

public class SetMatrixZeroes {
    void main(){
        int[][] mat = { { 0, 1, 2, 0 },
                { 3, 4, 0, 2 },
                { 1, 3, 1, 5 } };
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        setMatrix(mat);
        //System.out.println(Arrays.deepToString(mat));

     for(int i=0;i<mat.length;i++){
         for(int j=0;j<mat[0].length;j++){
             System.out.print(mat[i][j]+ " ");
         }
         System.out.println();
     }


    }

    public static void setMatrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int tempCol=1;

        //Traverse the arr and mark first;
        //cell of each row and column
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j==0){
                        tempCol=0;
                    }else{
                        arr[0][j]=0;
                    }
                }
            }
        }
        //Travese and mark matrix from(1,1) to (n-1,m-1)
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][0]==0||arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }

        //Mark the first row
        if(arr[0][0]==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }

        //Mark the first column
        if(tempCol==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }

    }




}
