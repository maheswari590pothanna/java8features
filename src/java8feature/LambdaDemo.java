package java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("the size of the arrayList"+list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
