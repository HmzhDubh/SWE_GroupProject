package GROUP_PROJECT.FligthReservation.Model;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        // Private constructor to prevent instantiation
    }
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void execute(String sql) {
        System.out.println("Executing: " + sql);
        // Simulate database execution
    }
}