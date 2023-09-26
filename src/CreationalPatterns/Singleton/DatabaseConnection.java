package CreationalPatterns.Singleton;

public class DatabaseConnection {
    private static DatabaseConnection _connection;

    static DatabaseConnection get_connection() {
        if(_connection == null) {
            _connection = new DatabaseConnection();
            System.out.println("New connection created");
        } else {
            System.out.println("There is already an active connection");
        }

        return _connection;
    }
}
