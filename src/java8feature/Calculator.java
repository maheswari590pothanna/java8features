package java8feature;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;


public interface Calculator {
    int calculate(int a, int b);
}

abstract class calci implements Calculator {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        System.out.println("add=" + add.calculate(5, 6));
        System.out.println("sub=" + sub.calculate(3, 2));

        Map<String, Integer> map = new HashMap<>();
        map.put("java", 8);
        map.put("Spring", 5);
        map.forEach((key, value) ->System.out. println(key + ":" + value));

        new Thread(()-> System.out.println("Thread with Lambda!")).start();

        List<String> list= Arrays.asList("java","Lambda","kafka");
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);

        Optional<String> optional=Optional.of("java");
        optional.ifPresent(s->System.out.println("value is present:"+s));

        Predicate<String> isEmpty= s->s.isEmpty();
        System.out.println(isEmpty.test("java"));

        BiFunction<Integer,Integer,Integer> add1=(a, b)->a+b;
        System.out.println(add1.apply(2,3));

        Consumer<String> print= s-> System.out.println(s);
        print.accept("java");





    }
}
