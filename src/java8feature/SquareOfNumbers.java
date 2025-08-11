package java8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mahi", "seetu", "sreeni", "prani","Anni");
        names.stream().filter(name -> name.startsWith("A"))
                      .forEach(System.out::println);
    }
}
