package CreationalPatterns.Builder;

public class Main
{
    public static void main(String[] args) throws Exception {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.withFirstName("Belmondo").withAge(30).withAddress("Rua 123");

        try{
            Student student = studentBuilder.toStudent();
            System.out.println(student.getFirstName());
            System.out.println(student.getAge());
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}
