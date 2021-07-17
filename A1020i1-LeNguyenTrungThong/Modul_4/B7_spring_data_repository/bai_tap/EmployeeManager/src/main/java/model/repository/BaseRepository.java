package model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
//    String hostName = "localhost";
//    String sqlInstanceName = "SQLEXPRESS";
//    String database = "QLNV";
//    String userName = "sa";
//    String password = "Abc123456";


    public Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNV";
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


//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String connectionUrl = "jdbc:sqlserver://localhost;database=QLNV;";
//            String username = "sa";
//            String password = "Abc123456";
//            Connection con = DriverManager.getConnection(connectionUrl, username, password);
//            System.out.println("ok");
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//    }


//    public Connection getConnection()throws Exception {
//        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
//        if(instance == null || instance.trim().isEmpty())
//            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        return DriverManager.getConnection(url, userID, password);
//    }
//
//
//    private final String serverName = "DESKTOP-RHM4NOE";
//    private final String dbName = "QLNV";
//    private final String portNumber = "1433";
//    private final String instance="";
//    private final String userID = "";
//    private final String password = "";



//    private static String DB_URL = "jdbc:sqlserver://localhost:1433;" // jdbc:mysql://localhost:3306/QLNV
//            + "databaseName=QLNV";
//    private static String USER_NAME = "";
//    private static String PASSWORD = "";
//
//    public Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        String connectionUrl = "jdbc:sqlserver://localhost;database=QLNV;integratedSecurity=true;";
//        Connection con = DriverManager.getConnection(connectionUrl);
//        return con;
//    }


}
