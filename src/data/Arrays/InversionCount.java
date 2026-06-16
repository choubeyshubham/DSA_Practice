package data.Arrays;

public class InversionCount {

    void main() {
        int arr[] = {4, 3, 2, 1};
        System.out.println(inversionCount(arr));//6
        System.out.println(mergeCount(arr));//6
    }


    public static int inversionCount(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }








    //Merge optimal
    public static int mergeCount(int[] arr){
        return countInv(arr, 0, arr.length-1);
    }
    public static int countInv(int[] arr,int l, int r){
        int res=0;
        if(l<r){
            int m=(r+l)/2;
            res +=countInv(arr,l,m);
            res +=countInv(arr,m+1,r);
            res +=countAndMerge(arr,l,m,r);
        }
        return res;
    }
    public static int countAndMerge(int[] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++) left[i]=arr[i+l];
        for(int j=0;j<n2;j++) right[j]=arr[m+1+j];

        int res=0;
        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j< n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else{
                arr[k++]=right[j++];
                res +=(n1-i);
            }
        }

        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];

        return res;
    }



}


