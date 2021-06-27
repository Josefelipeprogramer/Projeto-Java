
package Tabelas;


import Conexao.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ModeloTabela {
     private ArrayList linhas= null;
    private String []colunas=null;
    
    public ModeloTabela (ArrayList lin, String []colu){
        setLinhas(lin);
        setColunas(colu);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
  public int getColumnCount(){
      return colunas.length; //Método para contar número de colunas
  }
  public int getRowCount(){
      return linhas.size();// Método para contar linhas
  }
  public String getColumnName (int numColu){
      return colunas[numColu];// Retorna quantidade de colunas pelo nome
  }
  public Object getValueAt (int numLin, int numColu){
      Object [] linha = (Object[])getLinhas().get(numLin);
      return linha[numColu];
  }
    
    
}
