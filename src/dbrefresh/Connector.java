package dbrefresh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by softish on 2016-07-31.
 */
public class Connector {
    private static final String ip_regex = "";
    private String ip;
    private String url;

    public Connector() {
        setIp();
        url = "jdbc:mysql://" + ip + ":3306/firstdb";
    }

    public void connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "bar", "password");
            System.out.println(connection.getCatalog());
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }


    private void setIp() {
        System.out.println("Enter ip: ");
        Scanner s = new Scanner(System.in);
        String ip = s.next();

        this.ip = ip;
    }
}
