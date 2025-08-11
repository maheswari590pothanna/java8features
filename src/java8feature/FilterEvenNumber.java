package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(num -> num % 2 == 0)
                .forEach(System.out::println);
        sc.close();
    }
}
