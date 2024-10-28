class Student {
    int Id;
    String Name;
    static String School;
    static {
        School = "MIT";
        System.out.println("Static block called only ones");
    }

    // ! constructor ----------------------
    public Student() {
        this.Id = -1;
        this.Name = "";
    }
    public Student(int id, String name) {
        this.Id = id;
        this.Name = name;
    }
    // ! ----------------------------------

    public static void SayHello() {
        // in static method you can call a static variable but you cannot use an instance variable
        System.out.println("Hello from " + Student.School);
    }
    
}

public class Main {
    public static void main(String args[]) throws ClassNotFoundException {
        
        Student[] students = new Student[2];

        students[0] = new Student(0, "Zakaria");
        students[1] = new Student(1, "Sara");

        for(Student student: students) {
            System.out.println(student.Id + " | " + student.Name + " | " + Student.School);
        }
        
        String name = "Sara";
        String str = new String("Zakaria");

        StringBuffer strB = new StringBuffer("Ommi"); // StringBuffer is thread safe
        strB.append(" is thd best Mother");
        System.out.println(strB);
        
        StringBuilder st = new StringBuilder("Hala Madrid y Nada Màs"); // String builder is not thread safe
        // String strin = st.toString();
        System.out.println(st);

        Class.forName("Student");// this method is to call a class if there is no object created

        Student.SayHello();

    }
}