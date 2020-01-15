/**
 *@author github.com/fkadeal
 *@author github.com/tinbit2007
 */
import java.awt.HeadlessException;//
import java.sql.SQLException;//

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Dbconn {
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:kids.sqlite");
            //JOptionPane.showMessageDialog(null,"connected Succefully to "+conn);
            System.out.println("connected Succefully");
            return conn;
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
             // System.out.println(e);
          JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
