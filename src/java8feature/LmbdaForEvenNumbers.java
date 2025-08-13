package java8feature;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LmbdaForEvenNumbers {
    public static void main(String[] args) {
        Predicate<Integer> isEven= x->x%2==0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));

        List<String> list= Arrays.asList("apple","pear","grapes");
        list.sort((s1,s2)->s2.compareTo(s1));
        list.forEach(System.out::println);

        List<String> list2=Arrays.asList("java","spring","lambda");
        List<String> upperList=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperList.forEach(System.out::println);

        List<Integer> list3=Arrays.asList(1, 2, 3, 4, 5);
        int sum=list3.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        List<Integer> numbers=Arrays.asList(1,2,3,4,6,7,8,9,10);
        List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);

        List<String> list4=Arrays.asList("java","Spring","Lambda");
        list4.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Integer> number=Arrays.asList(1,2,3,3,4,4,5,5,6,7,6,7,8,9);
        numbers.stream().distinct().forEach(System.out::println);

        List<Integer> num=Arrays.asList(1,2,3,4,5);
        long count=num.stream().count();
        System.out.println(count);

        List<String> listany=Arrays.asList("java","spring","lambda");
        boolean containsJava=list.stream().anyMatch(s->s.equals("java"));
        System.out.println("Contains 'Java': "+containsJava);

        List<Integer> numbers1=Arrays.asList(2,4,6,8,10);
        boolean allEven=numbers.stream().allMatch(n->n%2==0);
        System.out.println("All even: "+allEven);

        List<Integer> numbers2=Arrays.asList(2,4,6,8,10);
        boolean allEvens=numbers2.stream().allMatch(n->n%2==0);
        System.out.println("All evens: "+allEvens);



    }
}
