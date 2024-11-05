import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("One apple");
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("two apple");
        fruits.add("One banana");

        //anyMatch()
        boolean result = fruits.stream().anyMatch(v->{return v.startsWith("One");});
        System.out.println(result);

        //allMatch()
        result = fruits.stream().allMatch(v->{return v.startsWith("One");});
        System.out.println(result);

        //noneMatch()
       result = fruits.stream().noneMatch(v->{return v.startsWith("One");});
        System.out.println(result);

        //findAny()
        Optional<String> findAny = fruits.stream().findAny();
        System.out.println(findAny.get());

        //findFirst()
        Optional<String> findFirst = fruits.stream().findFirst();
        System.out.println(findFirst.get());

        // concating the streams
        List<String> animalList = Arrays.asList("Dog","cat","Tiger");
        List<String> birdList = Arrays.asList("crow","hen","peacock");

        Stream<String> animalStream = animalList.stream();
        Stream<String> birdStream = birdList.stream();

        Stream.concat(animalStream,birdStream).collect(Collectors.toList()).forEach(p-> System.out.println(p));
    }
}
