package data.String;

public class ReverseString {
    void main(){

        String s ="Shubham Choubey";

        System.out.println(reverse(s));


    }

    public static String reverse(String s){
        char[] ch=s.toCharArray();

        int left=0;
        int right=s.length()-1;

        while(left<right) {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }





}
