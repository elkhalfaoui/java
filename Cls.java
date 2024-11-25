class A {
    public A() {
        this(8);
        System.out.println("class A");
    }
    public A(int a) {
        System.out.println("class A int");
    }
}
class B extends A {
    public B() {
        this(7);
        System.out.println("class B");
    }
    public B(int b) {
        super();
        System.out.println("class B int");
    }
}
class AdvancedCalculator extends Calculator {
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}


public class Cls {
    public static void main(String[] args) {
        // new B(); //! Anonymous Object
        @SuppressWarnings("unused")
        A objB = new B();

        double a = new AdvancedCalculator().power(2, 5);
        System.out.println(a);

        int b = new AdvancedCalculator().add(66, 3);
        System.out.println(b);
    }
}
// class and interface => Calc, Runable...
// variable and method => add(), showName()...
// constants (final) => PIE, NUM...