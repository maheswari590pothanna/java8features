package java8feature;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCounting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "Spring", "lambda", "spring");
        long count = list.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
