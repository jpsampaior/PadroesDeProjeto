package CreationalPatterns.Builder;

public class StudentBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String number;
    private String address;

    public StudentBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder withNumber(String number) {
        this.number = number;
        return this;
    }

    public StudentBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder() {

    }

    public Student toStudent() throws Exception {
        validateStudent();
        return new Student(firstName, lastName, age, number, address);
    }

    private void validateStudent() throws Exception {
        if(firstName == null || firstName.isEmpty()) {
            throw  new Exception();
        }
        if(age < 17) {
            throw new Exception();
        }
    }
}
