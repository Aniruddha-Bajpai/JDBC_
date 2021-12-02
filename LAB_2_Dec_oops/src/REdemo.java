import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class REdemo {
    public static void main(String args[])
    {
//        String str= "b%#@abcdbbb9087 &";
////        String str = "abc@gmail.com the quick999999jdbc brown787878  foxx jumm242424ps jdbc";
//        Pattern p = Pattern.compile("\\W");
////        Pattern p = Pattern.compile("[a-zA-Z0-9._]+@gmail.com");
//        int ctr =0;
//        Matcher m = p.matcher(str);
//        while(m.find())
//        {
//            System.out.println(m.start()+"---------"+m.end()+"----------"+m.group());
//            ctr++;
//        }
//        System.out.println("no of counts = "+ctr);
        String str  = "neer";
        System.out.println(str.matches("[na-z]{4}"));
    }
}
class Stu23
{
    String name;
    boolean result;
    Stu23 str;
}
