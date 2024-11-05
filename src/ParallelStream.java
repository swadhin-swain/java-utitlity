import java.util.Arrays;
import java.util.List;

class Student1 {
    String name;
    int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class ParallelStream {
    public static void main(String[] args) {
        List<Student1> studentList = Arrays.asList(
                new Student1("david",82),
                new Student1("Bob",90),
                new Student1("john",65),
                new Student1("canedy",55),
                new Student1("Eric",85),
                new Student1("smith",88),
                new Student1("scott",50));

        studentList.stream().filter(s->s.score>=80).limit(3).
                forEach(p-> System.out.println(p.getName()+"---"+p.getScore()));

        System.out.println();


        // using parallel stream
        studentList.parallelStream().filter(s->s.score>=80).limit(3).
                forEach(p-> System.out.println(p.getName()+"---"+p.getScore()));

        System.out.println();


        // convert normal stream to parallel stream

        studentList.stream().parallel() .filter(s->s.score>=80).limit(3).
                forEach(p-> System.out.println(p.getName()+"---"+p.getScore()));
    }
}
