package vn.codegym.springsecurity.model.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    public Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Candidate";
        String userName = "sa";
        String password = "Abc123456";
        Connection connection = null;

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        return connection;
    }
}
