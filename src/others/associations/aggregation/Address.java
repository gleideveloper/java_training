package others.associations.aggregation;

public class Address {
    String flatname;
    int flatno;
    String streetname;
    String area;
    String city;
    int pincode;

    Address(String name, int no, String streetname, String area, String city, int pin) {
        this.flatname = name;
        this.flatno = no;
        this.streetname = streetname;
        this.area = area;
        this.city = city;
        this.pincode = pin;
    }
}
