package data.String;

public class CharacterCount {
    /*



     */

    void main(){

        String s="aabbcccdd";
        System.out.println(getCh(s));


    }

    public static String getCh(String s){
        StringBuilder sb= new StringBuilder();
        int count=1;
        int n=s.length()-1;
        for(int i=0;i<n;i++){
            if(i+1<s.length()  && s.charAt(i)==s.charAt(i+1)){
                count++;
            }else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }






}
