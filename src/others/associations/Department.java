package others.associations;

import java.util.List;

public class Department {
    String deptname;
    List<Teacher> teachers;

    Department(String name) {
        this.deptname = name;
    }

    public String getDepartmentName() {
        return deptname;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setDepartment(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
