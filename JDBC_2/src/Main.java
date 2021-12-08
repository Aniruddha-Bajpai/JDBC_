import java.util.*;
import java.sql.*;


public class Main {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DAOClass ob = new DAOClass();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e2data", "root", "");
            PreparedStatement psmt;
            switch (args[0]) {
                case "1":
                    psmt = con.prepareStatement(ob.Insert());
                    psmt.setInt(1, Integer.parseInt(args[1]));
                    psmt.setString(2, args[2]);
                    psmt.setString(3, args[3]);
                    psmt.setString(4, args[4]);
                    psmt.setInt(5, Integer.parseInt(args[5]));
                    psmt.executeUpdate();
                    break;
                case "2":
                    psmt = con.prepareStatement(ob.Delete());
                    psmt.setInt(1, Integer.parseInt(args[1]));
                    psmt.executeUpdate();
                    break;
                case "3":
                    psmt = con.prepareStatement(ob.Modify());
                    psmt.setInt(1, Integer.parseInt(args[1]));
                    psmt.executeUpdate();
                    break;
                case "4":
                    psmt = con.prepareStatement(ob.Display());
                    psmt.executeUpdate();
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        }
    }

