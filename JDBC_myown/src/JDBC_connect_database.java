import java.sql.*;

public class JDBC_connect_database {
    public static void main(String args[]) throws SQLException,ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/aniruddha";
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url,user,pass);
        PreparedStatement pstmnt = con.prepareStatement("select * from subject where Mathematics = ?");
        pstmnt.setInt(1,30);
        ResultSet res = pstmnt.executeQuery();
        while(res.next())
        {
            System.out.println(res.getInt(1)+" "+res.getInt(2)+" "+res.getInt(3)+" "+res.getInt(4));
        }
        res.close();
    }
}
