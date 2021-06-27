
package Tabelas;
import Conexao.*;
import java.sql.*;
import javax.swing.JOptionPane;
import Interface.Excluir_disciplina;
import Tabelas.Professor;
/**
 *
 * @author José Felipe
 */
public class Disciplina {
    
  Statement stmt= Conexao.stmt;
  
    public void cadastrarDisciplina(Statement stmt,String cod_disc, String nome_disc, String desc_disc,
    String cpf_prof){
try{
       
       
    
    stmt.executeUpdate("insert into disciplina (cod_disc, nome_disc,desc_disc,cpf_prof)"+" values('"+cod_disc+"','"
            + nome_disc+"','"+desc_disc+"','"+cpf_prof+"');");
    JOptionPane.showMessageDialog(null, "Disciplina cadastrada!");
} catch (Exception e){
        System.out.println("Erro ao inserir Disciplina!\n"+e);       
}
  
 
      }
    public void excluirdisciplina(String cod_disc){
    try{
        String Excluir = "Delete from disciplina where cod_disc = '"+cod_disc+"'";
        stmt.executeUpdate(Excluir);
        JOptionPane.showMessageDialog(null, "Cadastrado deletado!");
        }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar excluir discipina.\n"+e);}
    }
    public void selecionarDisciplinas(){
        try{
            ResultSet rs = stmt.executeQuery("Select*from Disciplina");
            while (rs.next()){
            String cod_disc= rs.getString("cod_disc");
            String nome_disc = rs.getString("nome_disc");
            String desc_disc = rs.getString("desc_disc");
            String cpf_prof= rs.getString("cpf_prof");
            
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCódigo: \n"+ cod_disc + "\nNome:\n"+nome_disc+"\nDescrição:\n"+desc_disc+"\nNome:\n"+cpf_prof);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar todos as Disciplinas!");
    }}
    
    public void selecionarDisc(String cod_disc){
        
        try{
            ResultSet rs = stmt.executeQuery("Select*from Disciplina where cod_disc = '"+cod_disc+"';");
            while (rs.next()){
            String cod_disci= rs.getString("cod_disc");
            String nome_disc = rs.getString("nome_disc");
            String desc_disc = rs.getString("desc_disc");
            String cpf_prof= rs.getString("cpf_prof");
                
            
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCódigo: \n"+ cod_disc+ "\nNome:\n"+nome_disc+"\nDescrição:\n"+desc_disc+
                "\nProfessor:\n"+cpf_prof);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar disciplina!\n"+e );
            }
           
            
    }
    
   
  
   
}
