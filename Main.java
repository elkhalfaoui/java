abstract class A {
    public abstract  void show();
}
class B extends A {
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

        // A objA = new A();
        A objB = new B(); // upcasting
        A objC = new C();

        // objA.show();
        objB.show();
        objC.show();
        
        B objB1 = (B)objB; // downcasting
        objB1.show();

        A objA = new A() {
            public void show() {
                System.out.println("Inner A class");
            }
        };
        objA.show();

        Computer laptop = new Laptop();
        Developper developper = new Developper();
        developper.DeveloppingApp(laptop);

        Computer desktop = new Desktop();
        developper.DeveloppingApp(desktop);
        
    }
}



class Developper {
    public void DeveloppingApp(Computer laptop) {
        laptop.code();
    }
}
interface Computer {
    void code();
}
class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("developper using a laptop to develope the app");
    }
}
class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("developper using a Desktop to develope the app");
    }
}