package oop;
import java.util.ArrayList;
// import oop.A;

public class Class {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Zakaria Elkhalfaoui";
        student1.mark = 92;
        
        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Ali Amekdouf";
        student2.mark = 87;
        

        Student student3 = new Student();
        student3.id = 3;
        student3.name = "Othmane Boukhris";
        student3.mark = 94;

        // Student students[] = new Student[3];
        Student students[] = {student1, student2, student3};// student1 is just the adresse of an object

        System.out.println(students[0].name);
        for(Student s: students) {
            System.out.println(s.id + " | " + s.name + ": " + s.mark);
        }

        ArrayList list = new ArrayList<>();
        
    }
}
class Student { 
    int id = 0;
    String name = "Komissa Mostapha";
    byte mark = 99;
}