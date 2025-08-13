package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list= Arrays.asList("java","Spring","Lambda");
        String joined=list.stream().collect(Collectors.joining(","));
        System.out.println(joined);
    }
}
