class A {
    public void show() {
        System.out.println("class A method show()");
    }
}
final class B extends A {
    @Override
    public void show() {
        System.out.println("class B method show()");
    }
}
final class C extends A {
    @Override
    public void show() {
        System.out.println("class C method show()");
    }
}


// final + variable => constant
// final + method => prevent method overriding
// final + class => prevent inheritense

public class Main {
    public static void main(String[] args) {

        A objA = new A();
        A objB = new B(); // upcasting
        A objC = new C();

        objA.show();
        objB.show();
        objC.show();
        
        B objB1 = (B)objB; // downcasting
        objB1.show();

        Integer i = 8;
    }
}
