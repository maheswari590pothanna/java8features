package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "banana", "cat", "elephant");
        List<Integer> lengths = words.stream().map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println("Original words:" + words);
        System.out.println("Original lengths:" + lengths);
    }
}

