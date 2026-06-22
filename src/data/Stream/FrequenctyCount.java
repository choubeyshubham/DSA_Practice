package data.Stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenctyCount {
    void main(){
        String str = "banana";

        Map mp=str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mp);



    }



}
