package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "Spring", "lambda", "spring");
        Set<String> set = list.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}




