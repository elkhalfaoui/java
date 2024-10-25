abstract class Car {
    public abstract void drive();
}

class BMW extends Car {
    public void drive() {
        System.out.println("Bayeriche Motoren Wercke");
    }
}

class  A {
    public void show() {
        System.out.println("Method show in class A");
    }
    class B {
        public void show() {
            System.out.println("Method show of class B which is inside class A");
        }
    }
}

public class Poly {
    public static void main(String[] args) {
        
    //    Integer num = new Integer(8);
       Integer num = 9;
       int num1 = num.intValue();
       System.out.println(num1); 

       String str = "12";
       int num2 = Integer.parseInt(str);
       System.out.println(num2);

       Car car1 = new BMW();
       car1.drive();

       A objA = new A();
       A.B objAB = objA.new B();
       objAB.show();

       A obj = new A() {

        public void show(){
            System.out.println("Anonymos class");
        }
       };
       obj.show();

    }
}
