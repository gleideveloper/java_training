package others.generics;

public class Cat extends Animal {
    private String nome;
    private String raca;

    public Cat(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public Cat() {
        System.out.println("Miau");
    }
}
