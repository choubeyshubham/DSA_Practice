package data.Arrays;

public class MissingNumberInArray {
    void main(){
        int[] arr={1,2,3,5};
        int n=5;
        System.out.println(missing(arr,n));
        System.out.println("==============");

        String s="abcdf";
        System.out.println(missingChar(s));

    }

    public static int missing(int[] arr,int n){
        int eSum=n*(n+1)/2;
        int res=0;
        for(int a:arr)
            res +=a;

        return eSum-res;
    }

    public static char missingChar(String s){
        for(char c='a';c<='z';c++){
            if(s.indexOf(c)==-1){
                return c;
            }
        }
        return '-';
    }






}
