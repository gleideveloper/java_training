package others.associations.composition;

import java.util.ArrayList;
import java.util.List;

//School class which contains students
public class School {
    private List<Student> students;

    School() {
        students = new ArrayList<Student>();
    }

    public int getTotalNumberOfStudents() {
        return students.size();
    }

    public List<Student> getStudents(){
        return students;
    }
}
