package others.generics;

public class Animal {
    String name;
    int age;

    public Animal() {
    }
    public void eat(){
        System.out.println("Animal come");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
