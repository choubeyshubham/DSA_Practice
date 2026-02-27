package data;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    void main() {

        String s = "geeksforgeeks";

        Character value = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);


        System.out.println(value);
        System.out.println(method(s));


    }



    public static Character method(String s){
        Map<Character,Integer> map= new LinkedHashMap<>();
        char[] ch=s.toCharArray();
        for(char c: ch)
            map.put(c,map.containsKey(c)? map.get(c)+1:1);
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1)
                return e.getKey();
        }
        return null;
    }

}
