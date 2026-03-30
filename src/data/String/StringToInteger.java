package data.String;

public class StringToInteger {

    void main() {
        String s = "  -0012g4";
        System.out.println(met(s));

    }



    public static int met(String s) {
        int sign = 1;
        int res = 0;
        int idx = 0;
        while (idx < s.length() && s.charAt(idx) == ' ') {//Ignoring white space
            idx++;
        }
        //Store the sign of the number
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx++) == '-') {
                sign = -1;
            }
        }

        //Construct the number digit by digit
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            //Handling overflow and underflow
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            // Append current digit to the result
            res = 10 * res + (s.charAt(idx++) - '0');
        }
        //
        return res * sign;
    }



}
