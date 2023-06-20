import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Students {
    private String name;
    private String sId;
    private String email;
    private String password;

    public static void printTable(Connection con, Statement statement) throws Exception {

        ResultSet resultSet = statement.executeQuery("select * from students");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("sid"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("email"));
            System.out.println(resultSet.getString("password"));
        }
    }
}
