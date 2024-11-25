package tools;

class Person {

    protected String name;
    public int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

}

class Dog {

    private String name;
    private String breed;

    public Dog(String n, String b) {
        this.name = n;
        this.breed = b;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getBreeed() {
        return this.breed;
    }
    public void setBreed(String b) {
        this.breed = b;
    }
}

public class Exercices {
    public static void main(String[] args) {

        Person person1 = new Person("Zakaria", 25);
        Person person2 = new Person("Sara", 7);

        System.out.println(person1.name +" | "+ person1.age);
        System.out.println(person2.name +" | "+ person2.age);

        Dog dog1 = new Dog("Max", "cane curso");
        Dog dog2 = new Dog("Jack", "Rotwiller");

        dog1.setBreed("Cane Curso");
        dog2.setBreed("German shippered");

        System.out.println(dog1.getBreeed() +" | "+ dog1.getName());
        System.out.println(dog2.getBreeed() +" | "+ dog2.getName());
        
    }
}
