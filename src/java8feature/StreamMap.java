package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","Spring","lambda");
        Map<Integer,List<String>> map=list.stream().collect(Collectors.groupingBy(String::length));
        map.forEach((k,v)->System.out.println(k+":"+v));
    }
}
