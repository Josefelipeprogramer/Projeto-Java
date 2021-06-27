package projeto;

import Conexao.*;
import java.sql.Statement;
import Interface.Login;

public class Projeto {
   

    public static void main(String[] args) {
    
        
         Conexao CO = new Conexao();
         Statement stmt = CO.Conexao();
         new Login().setVisible(true);
        
    }
    
}
