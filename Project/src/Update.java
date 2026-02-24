import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
    private final String url = "jdbc:mysql://localhost:3306/JDBC_Project";
    private final String username = "root";
    private final String password = "@Radhakrishna297";

    Update() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
          
            String query="update CURD set name=? where age=?";
            Connection connection=DriverManager.getConnection(url, username, password);
            PreparedStatement statement=connection.prepareStatement(query);
            
            statement.setString(1, "Ayush");
            statement.setInt(2, 23);
           
            int result=statement.executeUpdate();
            System.out.println(result + " rows affected.");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new Update();
    }
}
