import java.sql.*;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String args[]) throws ClassNotFoundException,SQLException
    {
        try {
            int count =0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e2data", "root", "");
            PreparedStatement ps = con.prepareStatement("insert into info values (?,?)");
            Pattern p1 = Pattern.compile("(0|[+]91)?[96][0-9]{9}");
            Pattern p2 = Pattern.compile("[a-zA-Z0-9._]+(@)+(gmail|yahoo)+.com");
            System.out.println("< Target String >");
            Scanner sc=new Scanner(System.in);
            String s = sc.nextLine();
            Matcher pno = p1.matcher(s);
            Matcher mail = p2.matcher(s);
            String val_pno=null;
            String val_mail=null;
            if(pno.find())
            {
                val_pno= pno.group();
                count++;
            }
            if(mail.find())
            {
                val_mail= mail.group();
                count++;
            }
            if(val_mail.equals("")|val_pno.equals("")|count<2)
            {
                throw new Exception("Invaild");
            }
            else
            {
                ps.setString(1,val_pno);
                ps.setString(2,val_mail);
                ps.executeUpdate();
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }

    }
//class Invalid_phone_email extends Exception {
// Invalid_phone_email(String s)
// {
//     super(s);
// }
//}

