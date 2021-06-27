/*Classe Professor*/

package Tabelas;
import Conexao.*;
import java.sql.*;
import javax.swing.JOptionPane;
import Interface.Excluir_prof;

/**
 *
 * @author José Felipe
 */
public class Professor {
    
 Statement stmt= Conexao.stmt;
  
    public void cadastrarProfessor(Statement stmt,String cpf_prof, String nome_prof, String sexo_prof,
    String idade_prof, String nome_disc, String salario_prof){
    
 try{
       
       
    
    stmt.executeUpdate("insert into professor (cpf_prof, nome_prof,sexo_prof,idade_prof, nome_disc, salario_prof)"+" values('"+cpf_prof+"','"
            + nome_prof+"','"+sexo_prof+"','"+idade_prof+"','"+nome_disc+"','"+salario_prof+"');");
    JOptionPane.showMessageDialog(null, "Professor cadastrado!");
} catch (Exception e){
        System.out.println("Deu erro ao inserir Professor!\n"+e);       
}
  
 
      }
    public void excluirCadprof(String cpf_prof){
    try{
        String Excluir = "Delete from Professor where cpf_prof = '"+cpf_prof+"'";
        stmt.executeUpdate(Excluir);
        JOptionPane.showMessageDialog(null, "Cadastrado deletado!");
        }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar excluir o cadastro do Professor.\n"+e);}
    }
    public void selecionarProfessores(){
        try{
            ResultSet rs = stmt.executeQuery("Select*from Professor");
            while (rs.next()){
            String cpf_prof = rs.getString("cpf_prof");
            String nome_prof= rs.getString("nome_prof");
            String sexo_prof= rs.getString("sexo_prof");
            String idade_prof= rs.getString("idade_prof");
            String nome_disc= rs.getString("nome_disc");
            String salario_prof = rs.getString("salario_prof");
            
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCpf: \n"+ cpf_prof + "\nNome:\n"+nome_prof+"\nSexo:\n"+sexo_prof+
                "\nData de Nascimento:\n"+idade_prof+"\nDisciplina:\n"+nome_disc+"\nSalário:\n"+salario_prof);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar todos os Professores!\n"+e);
    }}
      public void selecionarProfessor(String cpf_prof){
        
        try{
            ResultSet rs = stmt.executeQuery("Select*from professor where cpf_prof = '"+cpf_prof+"';");
            while (rs.next()){
            String cpf_profe = rs.getString("cpf_prof");
            String nome_prof= rs.getString("nome_prof");
            String sexo_prof= rs.getString("sexo_prof");
            String idade_prof= rs.getString("idade_prof");
            String nome_disc= rs.getString("nome_disc");
            String salario_prof = rs.getString("salario_prof");
            
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCpf: \n"+ cpf_profe + "\nNome:\n"+nome_prof+"\nSexo:\n"+sexo_prof+
                "\nIdade:\n"+idade_prof+"\nDisciplina:\n"+nome_disc+"\nSalário:\n"+salario_prof);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar Professor!\n"+e );
            }
      }
       public void atualizarSalario(String cpf_prof, String salario_prof){
    try{
        String Atualizar = "Update Professor set salario_prof = '"+salario_prof+"' where cpf_prof = '"+cpf_prof+"'";
        stmt.executeUpdate(Atualizar);
        JOptionPane.showMessageDialog(null, "Salário atualizado!");
    }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar atualizar Sáario do Professor.\n"+e);}
      }

   

    
    
    
}
