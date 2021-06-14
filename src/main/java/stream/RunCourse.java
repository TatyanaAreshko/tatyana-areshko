package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunCourse {
    public static void main(String[] args) {

        //List<Course> courseList = new ArrayList<>();
        Course c1 = new Course("Math");
        Course c2 = new Course("Drawing");
        Course c3 = new Course("Programming");

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Ivan", Arrays.asList(c1)),
                new Student("Ivan", Arrays.asList(c1)),
                new Student("Petr", Arrays.asList(c1, c2)),
                new Student("Max", Arrays.asList(c1, c3)),
                new Student("Jane", Arrays.asList(c3)),
                new Student("Kate", Arrays.asList(c1, c2, c3))));

        System.out.println(getUniqStudCourse(students.stream()));


    }

    static List<Course> getUniqStudCourse(Stream<Student> students) {
        List<Course> courses;
        List<Course> courseList = new ArrayList<>();
        students.forEach((student)->courseList.addAll(student.getCourses()));
        courses = courseList.stream()
        .distinct()
        .collect(Collectors.toList());
        return courses;
    }
}



/*    Имеется следующая структура:
      class Student:у него есть 2 поля String name, List<Course> courses
      class Course - пустой.

      1. Написать метод принимающий на вход список студентов и возвращающий спискок уникальных курсов,
      которые изучаются студентами.

      2. Написать метод который принимает на вход список студентов и возвращающий список из трех студентов
      с самым большим количеством курсов.

      3. Написать метод, который принимает на вход список студентов и название курса,
      и возвращающий список всех студентов которые посещают этот курс.*/