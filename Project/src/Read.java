import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Read {
    private final String url = "jdbc:mysql://localhost:3306/JDBC_Project";
    private final String username = "root";
    private final String password = "@Radhakrishna297";

    Read() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
          
            String query="select*from CURD";
            Connection connection=DriverManager.getConnection(url, username, password);
            PreparedStatement statement=connection.prepareStatement(query);
            
            ResultSet res=statement.executeQuery();
            while (res.next()) {
                int id=res.getInt("Serial_no");
                String name = res.getString("name");
                int age = res.getInt("age");
                double marks = res.getDouble("marks");

                System.out.println("Serial: "+id+
                    ", Name: " + name +
                                   ", Age: " + age +
                                   ", Marks: " + marks);
            }

            
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new Read();
    }
}
