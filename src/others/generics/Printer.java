package others.generics;

public class Printer<T> {
    T thingToPrint;
    //V otherToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
