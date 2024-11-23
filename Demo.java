class Calculator {

    public Calculator() {
        System.out.println("class Calculator");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public int add(int a, int b) {

        return a + b;
    }

    public static void addition(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
public class Demo {
    public static void main(String args[]) {

        int obj1 = new Calculator().add(4, 4);

        // int a = obj1.add(176, 17);
        
        System.out.println(obj1);

        Calculator.addition(1, 3);
        
    }
}