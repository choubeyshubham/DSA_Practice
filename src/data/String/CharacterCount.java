package data.String;

public class CharacterCount {
    /*



     */

    void main(){

        String s="aabbccc";//a2b2c3
        System.out.println(getCh(s));
    }
    public static String getCh(String s) {
        if(s==null || s.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if ( s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);

        return sb.toString();
    }








}
