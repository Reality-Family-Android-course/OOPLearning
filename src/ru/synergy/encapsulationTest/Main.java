package ru.synergy.encapsulationTest;


public class Main {

    public static void main(String[] args) {
        Person kate = new Person("Kate", 30);
        System.out.println(kate.getAge());
        kate.setAge(33);
        System.out.println(kate.getAge());
        kate.setAge(123124452);

        System.out.println(kate.getAge());
        kate.displayId();

        System.out.println(Person.counter);

        Person andrew = new Person("Andrew", 27);
        andrew.displayId();

        System.out.println(Person.counter);

    }
}

class Person {
    public static final String TAG = "PERSON";
    private String name;
    private int age;
    private int id;
    static int counter = 1;

    static{
        counter = 105;
        System.out.println("Static initializer");
    }

    private boolean isAgeValid(int age) {
        if (age > 0 && age < 150) {
            return true;
        } else return false;
    }

    public Person(String name, int age) {
        System.out.println("Я конструктор и я сейчас собрал нового человека по имени " + name);
        if (isAgeValid(age)) {
            this.age = age;
        } else System.err.println("Age is not valid");
        this.name = name;
        this.id = counter++;
    }

    public void displayId() {
        System.out.println(this.name + " person id is: " + this.id);
    }

    public static void getRandomNumber() {
        System.out.println((int) Math.random() * 1000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isAgeValid(age)) {
            this.age = age;
        } else System.err.println("Age is not valid");
    }
}
