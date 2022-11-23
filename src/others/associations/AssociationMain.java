package others.associations;

import java.util.ArrayList;
import java.util.List;

public class AssociationMain {
    public static void main(String[] args) {
        Department d = new Department("Computer Science");

        Teacher t1 = new Teacher("Shyamala", "Data Structures");
        Teacher t2 = new Teacher("Mohan","Networking");

        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(t1);
        teachers.add(t2);

        d.setDepartment(teachers);

        System.out.println(d.getTeachers() + " are the list of teachers in the Department " + d.getDepartmentName());
        System.out.println("Teacher details: ");
        System.out.println(t1.getTeacherName() + " " + t1.getSubject());
        System.out.println(t2.getTeacherName() + " " + t2.getSubject());
    }
}
