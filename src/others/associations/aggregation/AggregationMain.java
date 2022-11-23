package others.associations.aggregation;

public class AggregationMain {

    public static void main(String[] args) {
        Address ad = new Address("OakMont",10,"Maruthi nagar","Banaswadi","Bangalore",560072);
        Person p = new Person("Ravi",ad);
        System.out.println("Person Name: " + p.name);
        System.out.println("Address: ");
        System.out.println(p.ad.flatno + ", " + p.ad.flatname + ", " + p.ad.streetname);
        System.out.println(p.ad.area);
        System.out.println(p.ad.city + " - " + p.ad.pincode);
    }
}
