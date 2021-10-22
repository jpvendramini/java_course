package module19.exercicio2.application;

import module19.exercicio2.domain.Course;
import java.util.*;

public class Program {
    private String name;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] courses = {"A", "B", "C"};
        Set<Course> courseSet = new HashSet<>();

        for (String course : courses){
            System.out.print("How many students for course " + course + "?");
            int n = sc.nextInt();
            while (n != 0){
                courseSet.add(new Course(course, sc.nextInt()));
                n--;
            }
        }
        System.out.println(courseSet.size());
    }
}