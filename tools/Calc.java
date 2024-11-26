package tools;

public  class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {

        try {
            return a/b;
        }
        catch(Exception err) {
            System.err.println("cannot divide by zero");
            return -1;
        }
    }
}

