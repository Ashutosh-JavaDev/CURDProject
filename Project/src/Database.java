import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Driver;
import java.sql.DriverManager;

public class Database {
    private final String url = "jdbc:mysql://localhost:3306/?JDBC_Project";
    private final String username = "root";
    private final String password = "@Radhakrishna297";

    Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
    }

    public static void main(String[] args) throws Exception {

    }
}
