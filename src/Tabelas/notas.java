/*Classe Notas*/
package Tabelas;
import Conexao.*;
import java.sql.*;
import javax.swing.JOptionPane;
import Interface.Excluir_notas;
/**
 *
 * @author José Felipe
 */
public class notas {
    
   
    
    // Atributos da Classe Notas
    Statement stmt= Conexao.stmt;
  
    public void cadastrarNotas(Statement stmt,String cod_nota, String freq_nota, String cod_disc,
    String cpf_prof, String cpf_al, String nota_n){
    
  try{
       
       
    
    stmt.executeUpdate("insert into notas (cod_nota, freq_nota,cod_disc,cpf_prof, cpf_al,nota_n)"+" values('"+cod_nota+"','"
            + freq_nota+"','"+cod_disc+"','"+cpf_prof+"','"+cpf_al+"','"+nota_n+"');");
    JOptionPane.showMessageDialog(null, "Nota Cadastrada!");
} catch (Exception e){
        System.out.println("Erro ao inserir Nota!\n"+e);       
}
  
 
      }
    public void excluirnota(String cod_nota){
    try{
        String Excluir = "Delete from notas where cod_nota = '"+cod_nota+"'";
        stmt.executeUpdate(Excluir);
        JOptionPane.showMessageDialog(null, "Cadastrado deletado!");
        }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar excluir notas.\n"+e);}
    }
    public void selecionarNotas(){
        try{
            ResultSet rs = stmt.executeQuery("Select*from Notas");
            while (rs.next()){
            String cod_nota= rs.getString("cod_nota");
            String freq_nota = rs.getString("freq_nota");
            String cod_disc = rs.getString("cod_disc");
            String cpf_prof= rs.getString("cpf_prof");
            String cpf_al= rs.getString("cpf_al");
            String nota_n=rs.getString("nota_n");
          
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCódigo: \n"+ cod_nota + "\nFrequência:\n"+freq_nota+"\nCódigo da Disciplina:\n"+cod_disc+"\nCpf do Professor:\n"+cpf_prof+"\nCpf do Aluno:\n"+cpf_al+"\nCpf do Aluno:\n"+nota_n);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar todos os Alunos!");
    }}
     public void selecionarNota(String cod_nota){
        
        try{
            ResultSet rs = stmt.executeQuery("Select*from notas where cod_nota= '"+cod_nota+"';");
            while (rs.next()){
            String cod_notas= rs.getString("cod_nota");
            String freq_nota = rs.getString("freq_nota");
            String cod_disc = rs.getString("cod_disc");
            String cpf_prof= rs.getString("cpf_prof");
            String cpf_al= rs.getString("cpf_al");
            String nota_n=rs.getString("nota_n");
          
         
            
            
                JOptionPane.showMessageDialog(null,"\nResultado:\nCódigo: \n"+ cod_notas + "\nFrequência:\n"+freq_nota+"\nDisciplina:\n"+cod_disc+
                        "\n CPF do Professor:\n"+cpf_prof+"\n CPF do Aluno:\n"+cpf_al+"\n CPF do Aluno:\n"+nota_n);
            }}catch (Exception e){
            System.out.println("Erro ao selecionar Professor!\n"+e );
            }
      }
      public void atualizarNota(String cod_nota, String nota_n){
    try{
        String Atualizar = "Update Notas set nota_n = '"+nota_n+"' where cod_nota = '"+cod_nota+"'";
        stmt.executeUpdate(Atualizar);
        JOptionPane.showMessageDialog(null, "Nota Atualizada!");
    }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar atualizar nota do Aluno.\n"+e);}
      }
      public void atualizarFrequencia(String cod_nota, String freq_nota){
    try{
        String Atualizar = "Update Notas set freq_nota = '"+freq_nota+"' where cod_nota = '"+cod_nota+"'";
        stmt.executeUpdate(Atualizar);
        JOptionPane.showMessageDialog(null, "Frequência Atualizada!");
    }catch (Exception e){
        System.out.println("Ocorreu um erro ao tentar atualizar Frequência do Aluno.\n"+e);}
      }
    
    }

    
    

   

    
    
    




