class Calc {

    public int add (int a, int b) {
        return a+b;
    }
    public int sub (int a, int b) {
        return a-b;
    }
}

class AdvencedCalc extends Calc {
    public int mult(int a, int b) {
        return a*b;
    }
    public int div(int a, int b) {
        if(b == 0) {
            return -1;
        }
        return a/b;
    }
}

public class Main {
    public static void main(String args[]) {

       AdvencedCalc calc1 = new AdvencedCalc();

       System.out.println(calc1.add(3, 4));
       System.out.println(calc1.div(48, 4));

    }
}