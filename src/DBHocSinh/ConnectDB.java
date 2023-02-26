package QuanLyHocSinh_Java.src.DBHocSinh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectDB {
    private Connection connect;
    public ConnectDB(){
        try{
            connect=null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user="sa";
            String pass="123456";
            connect= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLiHocSinh;encrypt=true;trustServerCertificate=true",user,pass);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
