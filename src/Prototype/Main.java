package Prototype;

public class Main {
    public static void main(String[] args) {
        Person FirstPerson = new Person();
        FirstPerson.setName("Joe");

        Person SecondPerson = FirstPerson.clone();
        System.out.println(SecondPerson.getName());
    }
}
