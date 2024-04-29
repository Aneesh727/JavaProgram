package streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);

        // using normal arraylist
//        List<Integer> squareList = new ArrayList<>();
//        for(Integer i:numberList){
//            squareList.add(i*i);
//        }
        // using streams
//        List<Integer> squareList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
//        System.out.println("List of squared numbers: " + squareList);


        // using hashset
//        Set<Integer> squareSet = new HashSet<>();
//        for(Integer i:numberList){
//            squareSet.add(i*i);
//        }
//        Set<Integer> squareSet = numberList.stream().map(x->x*x).collect(Collectors.toSet());
//        System.out.println("List of squared numbers: " + squareSet);


        //
        List<String> languages = new ArrayList<>();
        languages.add("scala");
        languages.add("java");
        languages.add("python");
        languages.add("basic");

//        List<String> filterResult = new ArrayList<>();
//        for(String s:languages){
//            if(s.startsWith("p")){
//                filterResult.add(s);
//            }
//        }

//        List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
//        System.out.println("Languages starting with 'p': " + filterResult);

//        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
//        System.out.println("Languages sorted alphabetically: " + sortedList);

//        System.out.println("printing all elements one by one: " );
//        languages.stream().forEach(y -> {
//            System.out.println("element is: " + y);
//        });

        // demonstration of each method
//        System.out.println("printing all elements one by one:");
//        numberList.stream().map(x->x*x).forEach(y-> System.out.println("element is: " + y));

        // demonstration of reduce method
//        int sum = numberList.stream().reduce(0,(ans,i)-> ans+i);
//        System.out.println("sum of all elements in the numberlist: " + sum);




        // --REDUCE
        int sum = numberList.stream().reduce(0,(ans,i)-> ans+i);
        System.out.println("sum of all elements in the numberList: " + sum);

    }
}
