
 


package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class Coneccion {
     Connection  conet=null;
       
    public Connection conexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conet=DriverManager.getConnection("jdbc:sqlserver://server\\MSSQLSERVER;databaseName=pegasus;integratedSecurity=true");
           //JOptionPane.showMessageDialog(null,"conectado");
        }catch(Exception e) {
            e.printStackTrace();
           
        }
          return conet;
    }
    
    
    /*public Connection conexion(){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conet=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Visual FoxPro Driver};SourceType=DBF;SourceDB=D:\\Data;");
           //JOptionPane.showMessageDialog(null,"conectado");
        } catch (Exception e) {
            e.printStackTrace();
           
        }
          return conet;
    }*/
    
}
