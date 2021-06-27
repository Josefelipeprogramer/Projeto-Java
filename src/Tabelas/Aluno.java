/* Classe Aluno*/
package Tabelas;
import Conexao.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author José Felipe
 */
public class Aluno{
    
  Statement stmt= Conexao.stmt;
  
    public void cadastrarAluno1(Statement stmt,String cpf_al, String nome_al, String sexo_al,
    String idade_al, String serie_al, String turno_al, String turma_al){
    
   
        try{
       
       
    
    stmt.executeUpdate("insert into aluno (cpf_al, nome_al,sexo_al,idade_al, serie_al, turno_al, turma_al)"+" values('"+cpf_al+"','"
            + nome_al+"','"+sexo_al+"','"+idade_al+"','"+serie_al+"','"+turno_al+"','"+turma_al+"');");
    JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
} catch (Exception e){
        System.out.println("Erro ao inserir Aluno!\n"+e);       
}
  
 
      }
    public void excluirCadastro(String cpf_al){
    try{
        String Excluir= ("Delete from Aluno where cpf_al = '"+cpf_al+"'");
        stmt.executeUpdate(Excluir);
        JOptionPane.showMessageDialog(null, "Cadastrado deletado!");
        }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar excluir o cadastro do Aluno.\n"+e);}
    }
    public void selecionarAlunos(){
        try{
            ResultSet rs = stmt.executeQuery("Select*from Aluno");
            while (rs.next()){
            String cpf_al = rs.getString("cpf_al");
            String nome_al = rs.getString("nome_al");
            String sexo_al = rs.getString("sexo_al");
            String idade_al= rs.getString("idade_al");
            String serie_al = rs.getString("serie_al");
            String turno_al = rs.getString("turno_al");
            String turma_al = rs.getString("turma_al");
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCpf: \n"+ cpf_al + "\nNome:\n"+nome_al+"\nSexo:\n"+sexo_al+
                "\nIdade:\n"+idade_al+"\nSerie:\n"+serie_al+"\nTurno:\n"+turno_al+"\nTurma:\n"+turma_al);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar todos os Alunos!\n"+e );
    }}
       public void selecionarAluno(String cpf_al){
        
        try{
            ResultSet rs = stmt.executeQuery("Select*from aluno where cpf_al = '"+cpf_al+"';");
            while (rs.next()){
            String cpf_alu = rs.getString("cpf_al");
            String nome_al = rs.getString("nome_al");
            String sexo_al = rs.getString("sexo_al");
            String idade_al= rs.getString("idade_al");
            String serie_al = rs.getString("serie_al");
            String turno_al = rs.getString("turno_al");
            String turma_al = rs.getString("turma_al");
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCpf: \n"+ cpf_alu + "\nNome:\n"+nome_al+"\nSexo:\n"+sexo_al+
                "\nIdade:\n"+idade_al+"\nSerie:\n"+serie_al+"\nTurno:\n"+turno_al+"\nTurma:\n"+turma_al);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar Aluno!\n"+e );
            }
           
            
    }
    public void atualizarSerie(String cpf_al, String serie_al){
    try{
        String Atualizar = "Update Aluno set serie_al = '"+serie_al+"' where cpf_al = '"+cpf_al+"'";
        stmt.executeUpdate(Atualizar);
        JOptionPane.showMessageDialog(null, "Serie atualizada!");
    }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar atualizar série do Aluno.\n"+e);}
      }
    public void atualizarTurma(String cpf_al, String turma_al){
    try{
        String Atualizar = "Update Aluno set turma_al = '"+turma_al+"' where cpf_al = '"+cpf_al+"'";
        stmt.executeUpdate(Atualizar);
        JOptionPane.showMessageDialog(null, "Turma atualizada!");
    }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar atualizar turma do Aluno.\n"+e);}
      }
    public void atualizarTurno(String cpf_al, String turno_al){
    try{
        String Atualizar = "Update Aluno set turno_al = '"+turno_al+"' where cpf_al = '"+cpf_al+"'";
        stmt.executeUpdate(Atualizar);
        JOptionPane.showMessageDialog(null, "Turno atualizada!");
    }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar atualizar turno do Aluno.\n"+e);}
      }

}
    


