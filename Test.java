import tools.Calc;
import tools.AdvenceCalc;
// import tools.*;

class Mobile {
    static String type;
    String brand;
    String name;
    int price;

    static { // static block initialize only one time
        type = "Smart phone";
    }

}

public class Test {
    // public static void main(String[] args) throws ClassNotFoundException {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.name = "Ipohone 16 pro max";
        mobile1.price = 1199;

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.name = "Galaxy s24 ultra";
        mobile2.price = 1199;

        // mobile1.type = "Smart phone";
        // Mobile.type = "Smart phone";

        Mobile mobiles[] = new Mobile[2];
        mobiles[0] = mobile1;
        mobiles[1] = mobile2;
        for (Mobile mobile : mobiles) {
            System.out.println(mobile.brand +" | "+ mobile.name +" | "+ mobile.price +" | "+ Mobile.type);
        }

        // Class.forName("Mobile");

        Calc calc1 = new AdvenceCalc();
        int a = calc1.add(1, 2);
        System.out.println(a);
    }
}