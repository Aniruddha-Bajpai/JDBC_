import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class connect {
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //oracle.jdbc.Driver -if driver is of oracle
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gla_21","root","");
        Statement s = con.createStatement();
        ResultSet res = s.executeQuery("select * from student");
        while (res.next())
        {
            System.out.println(res.getInt(1)+" "+res.getString(2));
        }
        con.close();
    }
}
