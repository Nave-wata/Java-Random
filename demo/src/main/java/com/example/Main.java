import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Your name
 */
public class Main {
    public static void main(String... param) {
        System.out.println("Starting application...");
        Connection con = null;

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://192.168.3.21:3306/user",
                    "Nave-wata",
                    "pi0131");
            System.out.println("OK!");
        } catch (SQLException e) {
            System.out.println("No");
        }
    }
}
