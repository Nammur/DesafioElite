/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioelite.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Leonardo
 */
public class EmpresaTableModel extends AbstractTableModel{
    
    private List<Empresa> empresas = new ArrayList<>();
    private String[] colunas = {"CNPJ","Razão Social","Responsável Legal", "Tel. Contato", "Email", "Status"}; 
    

    @Override
    public int getRowCount() {
        return empresas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0 : 
               return empresas.get(rowIndex).getCnpj();
           case 1 : 
               return empresas.get(rowIndex).getRazaoSocial();
           case 2 : 
               return empresas.get(rowIndex).getResponsavelLegal().getNome();
           case 3 : 
               return empresas.get(rowIndex).getEmail();
           case 4 :
                return empresas.get(rowIndex).getTelefoneContato();
           case 5 : 
               return empresas.get(rowIndex).getStatus();
       }
       return null;
    }
    
    //adiciona a empresa na lista de empresas do sistema
    public void adcicionarEmpresa(Empresa empresa){
        this.empresas.add(empresa);
        //ao adicionar, ja adiciona de maneira que fique ordenada pela razão social
        Comparator<Empresa> compareByRazaoSocial = (Empresa o1, Empresa o2) -> o1.getRazaoSocial().compareTo( o2.getRazaoSocial());
        Collections.sort(empresas, compareByRazaoSocial);
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }
    
    
}
