package others.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        Printer<Integer> intPrinter = new Printer<>(23);
        intPrinter.print();
        Printer<String> strPrinter = new Printer<>("Gleides");
        strPrinter.print();
        Printer<Double> douPrinter = new Printer<>(35.5);
        douPrinter.print();
        Printer<Boolean> boolPrinter = new Printer<>(Boolean.FALSE);
        boolPrinter.print();

        ArrayList<Animal> cats = new ArrayList<>();
        cats.add(new Cat("Gleides","Puldou"));
        cats.add(new Dog("Gleides","Vinente"));

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        //printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
    }
    private static void printList(List<? extends Animal> myList){
        System.out.println(myList);

    }

}
