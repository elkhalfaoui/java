class Mobile {

    private  int id;
    private String brand;
    static String type;
    public Mobile() {
        id = 0;
        brand = "phone";
    }
    static {
        type = "Smart phone";
        System.out.println("Static block");
    }
    // Getters and Setters ----------------------------------
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String b) {
        this.brand = b;
    }
    // ------------------------------------------------------
    public void show() {
        System.out.println("id : "+this.id+" | brand: "+this.brand+" | type: "+Mobile.type);
    }

}
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        // java.lang.Class.forName("Mobile");

        // Mobile mob1 = new Mobile();
        // mob1.setId(1); // mob1.id = 1;
        // mob1.setBrand("Samsung Galaxy"); // mob1.brand = "Samsung Galaxy";
        // mob1.show();
        // Mobile mob2 = new Mobile();
        // mob2.setId(2); // mob2.id = 2;
        // mob2.setBrand("Apple Iphone"); // mob2.brand = "Apple Iphone";
        // mob2.show();

        int arr[] = {40,10,20,30};
        int max;
        int max_pos= -1;
        int freq[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            max = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] > max && freq[j] == 0) {
                    max = arr[j];
                    max_pos = j;
                }
                if(freq[j] >= 1) {
                    freq[j]++;
                }
            }
            freq[max_pos]++;
        }
        // System.out.println(max);
        for(int k:freq) {
            System.out.println(k);
        }

    }
}