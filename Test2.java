class Mobile {
    int id;
    String brand;
    static String type;

    static {
        type = "Smart phone";
        System.out.println("in static block");
    }
    public Mobile() {

        id = 0;
        brand = "-";
        System.out.println("in constructor ");
    }

    public void show() {
        System.out.println( id + "id => " + brand + " | " + type);
    }
}
public class Test2 {
    public static void main(String args[]) throws ClassNotFoundException {
        // Mobile.type = "phone";
        Mobile mob1 = new Mobile();
        mob1.id = 1;
        // mob1.brand = "Samsung Galaxy S24 Ultra";
        // mob1.type = "Smart phone";
        // System.out.println( mob1.id + "id => " + mob1.brand + " | ");
        // mob1.show();
        

        // Mobile mob2 = new Mobile();
        // mob2.id = 2;
        // mob2.brand = "Apple Iphone 16 Pro Max";
        // mob2.type = "Smart phone";
        // System.out.println( mob2.id + "id => " + mob2.brand + " | ");
        // mob2.show();

        // System.out.println(Mobile.type);
        java.lang.Class.forName("Mobile");

    }
}
