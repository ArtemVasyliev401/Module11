import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Ivan");
        name.add("Peter");
        name.add("Artem");
        name.add("Vasyl");
        name.add("Taras");
        name.add("Igor");
        System.out.println("----------------------<<Homework-1>>--------------------------");
        System.out.println("Utils.nameList(name) = " + Utils.nameList(name));

        System.out.println("----------------------<<Homework-2>>--------------------------");
        System.out.println("Utils.sortName(name) = " + Utils.sortName(name));

        System.out.println("----------------------<<Homework-3>>--------------------------");
        List <String> numb = List.of("1, 2, 0", "4, 5");
        System.out.println("Utils.sortNumbers(numb) = " + Utils.sortNumbers(numb));

        System.out.println("----------------------<<Homework-4>>--------------------------");
        Utils.generatorNumbers(5, 6, 7, 10);

        System.out.println("----------------------<<Homework-5>>--------------------------");
        Stream <Integer> first = Stream.of(1,2,3,4,5);
        Stream <Integer> second = Stream.of(5,6,7,8,9);
        System.out.println("Utils.zip "
                + Utils.zip(first, second).collect(Collectors.toList()));


    }
}