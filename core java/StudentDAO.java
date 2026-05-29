import java.sql.*;
public class StudentDAO {
    public void insert(int id, String n) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
        PreparedStatement p = c.prepareStatement("INSERT INTO students VALUES(?,?)");
        p.setInt(1,id);
        p.setString(2,n);
        p.executeUpdate();
    }
}
