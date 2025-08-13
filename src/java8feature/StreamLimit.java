package java8feature;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java", "Spring", "lambda", "kafka");
        stream.limit(2).forEach(System.out::println);
        stream.skip(2).forEach(System.out::println);
        stream.peek(System.out::println).collect(Collectors.toList());

        Optional<String> optional= Optional.of("java");
        optional.ifPresent(System.out::println);
    }
}
