package java8feature;

import java.util.*;

public class SortUsingLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.asList("mahi", "seetu", "sreeni", "prani");
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
        System.out.println(list);
    }
}
