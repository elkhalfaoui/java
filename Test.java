class A extends Object {
    public A() {
        System.out.println("class A");
    }
    public A(int a) {
        System.out.println("class A constructor");
    }
}
class B extends A {
    public B() {
        super(3);
        System.out.println("class B");
    }
    public B(int b) {
        // super(b);
        this();
        System.out.println("class B constructor");
    }
}
class Email {

    public int id;
    public String email;
    private String password;
    private int age;

    public Email() {
        id = 0;
        email = "example@gmail.com";
        password = "1234";
        age = 18;
    }

    public Email(int i, String e, String p, int a) {
        this.id = i;
        this.email = e;
        this.password = p;
        this.age = a;
        System.out.println("every time you create an object you wil call the constructor");
    }

    public String getPass() {
        return this.password;
    }
    public void setPass(String password) {
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) { 
        this.age = age;
    }
}

public class Test {
    public static void main(String args[]) {
        
        Email email1 = new Email(1, "zakaria@gmail.com", "1999", 25);
        System.out.println(email1.id + " | " + email1.email + " | " + email1.getPass() + " | " + email1.getAge());
        B obj = new B(17);
        System.out.println(obj);

    }
}