package data.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {

    void main(){

        List<Integer> list= Arrays.asList(45,7,3,9,10,21);//output "379102145"

        List<Integer> ls=list.stream().sorted().toList();

        String s=ls.stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println(s);



    }









}
