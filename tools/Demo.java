package tools; //! javac tools\Demo.java => java tools.Demo
import java.lang.*;

class Student {
    int Id;
    String Name;
    private int Grade;
    public Student() {
        this.Id = 0;
        this.Name = "-";
        this.Grade = 0;
    }
    public Student(int i, String n, int g) {
        this.Id = i;
        this.Name = n;
        this.Grade = g;
    }
    public int getGrade() {
        return this.Grade;
    }
    // obj.getGrade(st);
    // public int getGrade(Student st) {
    //     return st.Grade;
    // }
    public void setGrade(int g) {
        this.Grade = g;
    }
}

class A {
    public A() {
        super();
        System.out.println("A");
    }
    public A(int a) {
        // super();
        this();
        System.out.println("A int");
    }
}
class B extends A {
    public B() {
        // super();
        super(5);
        System.out.println("B");
    }
    public B(int b) {
        this();
        System.out.println("B int");
    }
}

public class Demo {
    // @SuppressWarnings("unused")
    public static void main (String[] args) {

        Student studnet1 = new Student(1, "Zakaria", 19);
        System.out.println(studnet1.Id + " | " + studnet1.Name + ": " + studnet1.getGrade());

        // new B(4); // anonymous object
        java.lang.System.out.println((int)(Math.pow(2, 3)));
        
    }
}