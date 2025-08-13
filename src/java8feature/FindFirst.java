package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","Spring","lambda");
        Optional<String> first=list.stream().findFirst();
        first.ifPresent(System.out::println);

    }
}
