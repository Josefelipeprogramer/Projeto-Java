
package Tabelas;


import Conexao.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Usuarios {
    Statement stmt= Conexao.stmt;
    private String cod_user;
    private String nome_user;
    private String senha_user;
    private String tipo_user;
    
     public void cadastrarUsuario(Statement stmt,String cod_user,String nome_user, String senha_user, String tipo_user){
    
   
        try{
       
       
    
    stmt.executeUpdate("insert into User (cod_user, nome_user,senha_user,tipo_user)"+" values('"+cod_user+"','"+nome_user+"','"+senha_user+"','"+tipo_user+"');");
    JOptionPane.showMessageDialog(null, "Usuário cadastrado!");
} catch (Exception e){
        System.out.println("Erro ao inserir novo Usuário!\n"+e);       
}
  
 
      }
      public void selecionarUsuario(String cod_user){
        
        try{
            ResultSet rs = stmt.executeQuery("Select*from user where cod_user = '"+cod_user+"';");
            while (rs.next()){
            String cod_userr = rs.getString("cod_user");
            String nome_user = rs.getString("nome_user");
            String senha_user = rs.getString("senha_user");
            String tipo_user = rs.getString("tipo_user");
           
                JOptionPane.showMessageDialog(null,"\nResultado:\nCódigo: \n"+ cod_userr  +"\nNome:\n"+nome_user+"\nSenha:\n"+senha_user+"\nTurno:\n"+tipo_user);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar Usuário!\n"+e );
            }
           
            
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public String getCod_user() {
        return cod_user;
    }

    public void setCod_user(String cod_user) {
        this.cod_user = cod_user;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getSenha_user() {
        return senha_user;
    }

    public void setSenha_user(String senha_user) {
        this.senha_user = senha_user;
    }

    public String getTipo_user() {
        return tipo_user;
    }

    public void setTipo_user(String tipo_user) {
        this.tipo_user = tipo_user;
    }
      
    
}
