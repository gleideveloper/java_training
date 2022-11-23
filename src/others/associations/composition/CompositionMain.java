package others.associations.composition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompositionMain {

    public static void main(String[] args) {
        Student s1 = new Student("Akash", 100);
        Student s2 = new Student("Avinash", 101);
        Student s3 = new Student("Balu", 102);


        //Create list of students
        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        School s = new School();
        s.getStudents().add(s1);
        int stu = s.getTotalNumberOfStudents();
    }
}
