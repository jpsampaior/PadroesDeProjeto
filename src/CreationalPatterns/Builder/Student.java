package CreationalPatterns.Builder;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String number;
    private final String address;

    public Student(String firstName, String lastName, int age, String number, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.number = number;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }
}