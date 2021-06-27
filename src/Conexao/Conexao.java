
package Conexao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    
    // Atributos
   
    public static Statement stmt;
    
    
    public Statement Conexao(){
        String url = new String("jdbc:mysql://localhost:3306/projeto" );
        String user= new String ("root");
        String password= new String("");
        Connection con;
    
    
    try{
    
    MysqlDataSource dt= new MysqlDataSource();
    dt.setURL(url);
    con=dt.getConnection(user, password);
    stmt=con.createStatement();
        System.out.println("Conexão criada com sucesso");
    }catch(SQLException e){
        System.out.println("Houve erro ao tentar Conectar"+e);
    }
        return stmt;

    }
    public void desconectar (){
       try {
           stmt.close();
           JOptionPane.showMessageDialog(null,"Conexão encerrada");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao tentar desconectar\n"+ex);
           
       }
    }
    
        
    
    
}
