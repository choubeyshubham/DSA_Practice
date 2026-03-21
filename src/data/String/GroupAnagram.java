package data.String;

import java.util.*;

public class GroupAnagram {

       void main() {
        List<String> anaList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");


        List<List<String>> groupAna = ana(anaList);      // {eat, tea, ate}, {tan, nat}, {bat}

        System.out.println(groupAna);

    }

    public static List<List<String>> ana(List<String> ana){
        Map<String,List<String>> map= new HashMap<>();
        for(String s:ana){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());


    }


}



