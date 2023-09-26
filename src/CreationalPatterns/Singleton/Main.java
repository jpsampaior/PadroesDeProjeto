package CreationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Attempt to create a connection");

        DatabaseConnection connection1 = DatabaseConnection.get_connection();
        DatabaseConnection connection2 = DatabaseConnection.get_connection();

        if(connection1 == connection2) {
            System.out.println("Both connection are equals");
        }
    }
}