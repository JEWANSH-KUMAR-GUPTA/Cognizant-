import java.sql.*;
public class BasicJDBC {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM students");
    }
}
