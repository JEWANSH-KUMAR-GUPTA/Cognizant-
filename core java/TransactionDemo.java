import java.sql.*;
public class TransactionDemo {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/db","root","");
        c.setAutoCommit(false);
        c.commit();
    }
}
