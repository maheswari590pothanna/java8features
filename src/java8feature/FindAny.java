package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    List<String> list= Arrays.asList("java","Spring","lambda");
    Optional<String> any=list.stream().findAny();


}
