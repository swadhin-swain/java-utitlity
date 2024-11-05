import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {
    public static void main(String[] args) {
        // map()

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> list2 = list1.stream().map(i->i+10).collect(Collectors.toList());

        System.out.println(list2);

        // FlatMap()
        List<Integer> list3 = Arrays.asList(1,2);
        List<Integer> list4 = Arrays.asList(3,4);
        List<Integer> list5 = Arrays.asList(5,6);

        List<List<Integer>> listed = Arrays.asList(list3,list4,list5);

        List<Integer> finalList = listed.stream().flatMap(x->x.stream()).collect(Collectors.toList());

        System.out.println(finalList);


        List<String> team1 = Arrays.asList("ram","shyam","dama");
        List<String> team2 = Arrays.asList("budhia","gobara","nandu");
        List<String> team3 = Arrays.asList("musa","doger","daria");

        List<List<String>> worldCupPlayer = Arrays.asList(team1,team2,team3);

        List<String> names = worldCupPlayer.stream().flatMap(x->x.stream()).collect(Collectors.toList());

        System.out.println(names);



        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("swadhin",88));
        students1.add(new Student("somanath",88));


        List<Student> students2 = new ArrayList<>();
        students1.add(new Student("tapas",88));
        students1.add(new Student("siba",88));

        List<List<Student>> studentList = Arrays.asList(students1,students2);

        List<String> allStudents = studentList.stream().flatMap(i->i.stream()).map(s->s.name).
                collect(Collectors.toList());

        System.out.println(allStudents);

    }

}

class  Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
