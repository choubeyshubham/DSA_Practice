package data.String;

public class ReverseString {
    void main() {

        String s = "Shubham Choubey";

        System.out.println(reverse(s));

        rev(s);

    }

    public static String reverse(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
        }

        return r;
    }

    public static void rev(String s){
        char[] ch=s.toCharArray();
        for(int i=s.length()-1;i>=0 ;i--){
            System.out.print(ch[i]);
        }

    }



}



