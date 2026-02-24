import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {
    private final String url = "jdbc:mysql://localhost:3306/?JDBC_Project";
    private final String username = "root";
    private final String password = "@Radhakrishna297";

    Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
          
            String query="insert into CURD(name,aage,marks) values (?,?,?)";
            Connection connection=DriverManager.getConnection(url, username, password);
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(0, "Ashutosh");
            statement.setInt(1, 23);
            statement.setDouble(2, 93.4);
            int result=statement.executeUpdate();
            if(result>0){
                System.out.println("Data Instered Successfully");
            }
            else{
                System.out.println("No Data has been Inserted");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
