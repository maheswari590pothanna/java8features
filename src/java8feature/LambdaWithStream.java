package java8feature;

import java.util.Arrays;
import java.util.List;

public class LambdaWithStream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","spring","lambda");
        boolean nonepython=list.stream().noneMatch((s->s.equals("python")));
        System.out.println("Contains no 'python':"+nonepython);
    }
}
