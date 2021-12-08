import java.sql.PreparedStatement;
import java.sql.*;
public class DAOClass {
    String Insert(){
        return "insert into student values (?,?,?,?)" ;
    }
    String Delete(){
        return "delete id from student where id = ?";
    }
    String Modify(){
        return "update student set sfees =4500 where id = ?";
    }
    String Display(){
        return "select * from student";
    }
}

