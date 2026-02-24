import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
    private final String url = "jdbc:mysql://localhost:3306/JDBC_Project";
    private final String username = "root";
    private final String password = "@Radhakrishna297";

    Delete() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
          
            String query="delete from CURD where name=?";
            Connection connection=DriverManager.getConnection(url, username, password);
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, "Ayush");
            int res=statement.executeUpdate();
            System.out.println(res+" Deleted");
            
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new Delete();
    }
}
