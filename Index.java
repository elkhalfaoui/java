class A {
    public void show() {
        System.out.println("class A");
    }
    @Override
    public String toString() {
        return "toString method in class A";
    }
    public void m1() {
        System.out.println("method m1 in class A");
    }
}
final class B extends A {
    @Override
    public final void show() {
        System.out.println("class B");
    }
    public void m2() {
        System.out.println("method m2 in class B");
    }
}
final class C extends A {
    @Override
    public final void show() {
        System.out.println("class C");
    }
}
// final variable => constant variable
// final method => prevent overriding the method
// final class => prevent inheritence from class
public class Index {
    public static void main(String args[]) {

        A objA = new A();
        A objB = new B();
        A objC = new C();

        objA.show();
        objB.show();
        objC.show();
        System.out.println(objB);
        System.out.println(objC);

        // A obj = (A) new B(); // upcasting
        A obj = new B();
        obj.m1();

        B obj1 = (B) obj; // downcasting
        obj1.m2();
    }
}