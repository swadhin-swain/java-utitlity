import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class non_terminal_methods {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("Bus","Truck","Auto","Bike","Bus","Truck","Auto","Bike");

        //distinct()

        List<String> distinctvehicle = vehicles.stream().distinct().collect(Collectors.toList());
        distinctvehicle.forEach(System.out::println);

        // limit()
        distinctvehicle = vehicles.stream().limit(3).collect(Collectors.toList());
        System.out.println(distinctvehicle);
    }
}
