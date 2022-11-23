package others.associations;

public class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getTeacherName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String toString() {
        return name;
    }
}
