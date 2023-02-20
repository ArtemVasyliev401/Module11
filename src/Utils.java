import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Utils {

    //----------------------<<Homework-1>>--------------------------
    public static String nameList(List<String> name){
        StringJoiner res = new StringJoiner(", ");
        IntStream.range(0, name.size())
                .forEach (index -> {
                    if(index % 2 != 0) {
                res.add(index + ". " + name.get(index));
            }

        });
            return res.toString();

    }

    //----------------------<<Homework-2>>--------------------------
    public static List<String> sortName(List<String> name){
        return name
                .stream()
                .sorted(Comparator.reverseOrder() )
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    //----------------------<<Homework-3>>--------------------------
    public static List<String> sortNumbers(List <String > numbers){
       return numbers.stream()
                .map(str -> List.of(str.split(", ") ))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());

    }

    //----------------------<<Homework-4>>--------------------------
    public static void generatorNumbers (int a, int c, int m, int size){

        Stream <Integer> stream = Stream.iterate(1, x -> (a * x + c)% m);
                stream
                        .limit(size)
                        .peek(System.out::println)
                        .collect(Collectors.toList());



    }

    //----------------------<<Homework-5>>--------------------------
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> res = new ArrayList<>();
        Iterator <T> firstIterator = first.iterator();
        Iterator <T> secondIterator = second.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()){
                    res.add(firstIterator.next());
                    res.add(secondIterator.next());

        }

        return res.stream();
    }

}



