package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello,lambda!");
        new Thread(r).start();

        List<String> list = Arrays.asList("java", "spring", "lambda");
        list.forEach(item -> System.out.println(item));

        List<String> listStr = Arrays.asList("java", "javascript", "pythion");
        List<String> filteredList = listStr.stream().filter(s -> s.startsWith("j"))
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);


        List<String> list3 = Arrays.asList("java", "Lambda", "Kafka");
        list3.sort((s1, s2) -> s1.compareTo(s2));
        list3.forEach(System.out::println);


    }
}
