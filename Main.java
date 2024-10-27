class Student {
    int Id;
    String Name;
    public Student(int id, String name) {
        this.Id = id;
        this.Name = name;
    }
}

public class Main {
    public static void main(String args[]) {
        
        Student[] students = new Student[2];

        students[0] = new Student(0, "Zakaria");
        students[1] = new Student(1, "Sara");

        for(Student student: students) {
            System.out.println(student.Id + " | " + student.Name);
        }
        
        String name = "Sara";
        String str = new String("Zakaria");

        StringBuffer strB = new StringBuffer("Ommi"); // StringBuffer is thread safe
        strB.append(" is thd best Mother");
        System.out.println(strB);
        
        StringBuilder st = new StringBuilder("Hala Madrid y Nada Màs"); // String builder is not thread safe
        // String strin = st.toString();
        System.out.println(st);

    }
}