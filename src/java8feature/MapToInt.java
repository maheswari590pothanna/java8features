package java8feature;

import java.util.Arrays;
import java.util.List;

public class MapToInt {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","Spring","Lambda");
        list.stream().mapToInt(String::length).forEach(System.out::println);
    }
}
