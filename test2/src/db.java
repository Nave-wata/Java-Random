import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://192.168.3.21/android",
                    "android",
                    "deer");
            System.out.println("OK!");
        } catch (SQLException e) {
            System.out.println("No");
        }
    }
}
