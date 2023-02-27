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
            connect= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SGU;encrypt=true;trustServerCertificate=true",user,pass);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void readData(){

    }
    public boolean checkSigup(int sdt,String matkhau,String maquyen){
        try{
            String sql="select * from Account where matkhau=? and sdt=? and status=1 and maloainguoidung=?";
            PreparedStatement ps=connect.prepareStatement(sql);
            ps.setString(1,matkhau);
            ps.setInt(2,sdt);
            ps.setString(3,maquyen);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
