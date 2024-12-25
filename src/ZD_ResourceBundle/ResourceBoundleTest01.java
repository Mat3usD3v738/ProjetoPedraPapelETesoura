package ZD_ResourceBundle;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Locale;
public class ResourceBoundleTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle rb  = ResourceBundle.getBundle("mensagens",locale);
        System.out.println(rb.getString("despedida"));
        System.out.println(rb.getString("saudacao"));
        Locale locale2 = new Locale("pt","BR");
        ResourceBundle rb2  = ResourceBundle.getBundle("mensagens",locale2);
        System.out.println(rb2.getString("despedida"));
        System.out.println(rb2.getString("saudacao"));
        System.out.println(rb.getString("system.os"));
    }
}
