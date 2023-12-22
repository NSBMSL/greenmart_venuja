package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {


    private Connection connection;  // Declare the Connection as a member variable

    public Connection getConnection() {
        return connection;
    }




    public void openConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/greensuper";
        String username = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Database class logged");

        connection = DriverManager.getConnection(url, username, password);
        System.out.println("Database connected");
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed");
            } catch (SQLException e) {
                System.out.println("Error closing database connection: " + e.getMessage());
            }
        }
    }


}
