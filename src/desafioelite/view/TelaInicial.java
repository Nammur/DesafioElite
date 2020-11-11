/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioelite.view;

import desafioelite.model.Empresa;
import desafioelite.model.EmpresaTableModel;
import desafioelite.util.Utilidades;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    EmpresaTableModel tableModel = new EmpresaTableModel();
    EmpresaTableModel tableModelAtivos = new EmpresaTableModel();
    EmpresaTableModel tableModelInativos = new EmpresaTableModel();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    Utilidades util = new Utilidades();
    
    public TelaInicial() {     
        
        for(int i=0;i<12;i++){
            tableModel.adcicionarEmpresa(util.gerarEmpresa(i));
            if(util.gerarEmpresa(i).getStatus() == 1){
                tableModelAtivos.adcicionarEmpresa(util.gerarEmpresa(i));
            }
            else{
                tableModelInativos.adcicionarEmpresa(util.gerarEmpresa(i));
            }
        }
        initComponents();
        
        jtEmpresas.setModel(tableModel);
        getNewRenderedTable(jtEmpresas);
    }
    
private static JTable getNewRenderedTable(final JTable table) {
    table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
        @Override
        public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int col) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
            int status = (int) table.getModel().getValueAt(row, 5);
            if (status == 1) {
                setBackground(Color.CYAN);
                setForeground(Color.black);
            } else {
                setBackground(Color.red);
                setForeground(Color.black);
            }       
            return this;
        }   
    });
    return table;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpresas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        verPorStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dateMax = new javax.swing.JFormattedTextField();
        dateMin = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateFilter = new javax.swing.JRadioButton();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtEmpresas.setAutoCreateRowSorter(true);
        jtEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtEmpresas);
        jtEmpresas.getAccessibleContext().setAccessibleName("");

        jButton1.setText("Exportar csv");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        verPorStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativos", "Inativos" }));
        verPorStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPorStatusActionPerformed(evt);
            }
        });

        jLabel1.setText("Ver de acordo com o status da empresa");

        try {
            dateMax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            dateMin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dateMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateMinActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Inferior");

        jLabel3.setText("Data Superior");

        dateFilter.setText("Filtra Por Data");
        dateFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFilterActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verPorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateMin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(dateMax, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateFilter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(verPorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("btn_Exportar");
        buscar.getAccessibleContext().setAccessibleName("Buscar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File arquivo = new File("Output");
        arquivo.mkdir();
        util.exportToCSV(jtEmpresas, "./Output"
                + "/download.csv");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void verPorStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPorStatusActionPerformed
    }//GEN-LAST:event_verPorStatusActionPerformed

    private void dateMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateMinActionPerformed
    }//GEN-LAST:event_dateMinActionPerformed

    private void dateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFilterActionPerformed
    }//GEN-LAST:event_dateFilterActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        EmpresaTableModel tableModelDateFull = new EmpresaTableModel();
        EmpresaTableModel tableModelAtivosDate = new EmpresaTableModel();
        EmpresaTableModel tableModelInativosDate = new EmpresaTableModel();
        if(dateFilter.isSelected()){
            Date dataMax = null;
            Date dataMin = null;
            try {
                dataMax = sdf.parse(dateMax.getText());
            } catch (ParseException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                dataMin = sdf.parse(dateMin.getText());
            } catch (ParseException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(int i=0;i<12;i++){
                Empresa e = util.gerarEmpresa(i);
                
                if(e.getDataInclusao().after(dataMin) && e.getDataInclusao().before(dataMax)){
                    
                    tableModelDateFull.adcicionarEmpresa(util.gerarEmpresa(i));
                    if((e.getStatus() == 1)){
                        tableModelAtivosDate.adcicionarEmpresa(util.gerarEmpresa(i));
                    }
                    else if((e.getStatus() == 2) && e.getDataInclusao().after(dataMin) && e.getDataInclusao().before(dataMax)){
                        tableModelInativosDate.adcicionarEmpresa(util.gerarEmpresa(i));
                    }
                }
            }
            if(verPorStatus.getSelectedItem().toString() == "Ativos"){
                jtEmpresas.setModel(tableModelAtivosDate);
            }
            else if(verPorStatus.getSelectedItem().toString() == "Inativos"){
                jtEmpresas.setModel(tableModelInativosDate);
            }
            else{
                jtEmpresas.setModel(tableModelDateFull);
            }
        }
        else{
            if(verPorStatus.getSelectedItem().toString() == "Ativos"){
                jtEmpresas.setModel(tableModelAtivos);
            }
            else if(verPorStatus.getSelectedItem().toString() == "Inativos"){
                jtEmpresas.setModel(tableModelInativos);
            }
            else{
                jtEmpresas.setModel(tableModel);
            }
        }
        getNewRenderedTable(jtEmpresas);
    }//GEN-LAST:event_buscarActionPerformed

    public static void main(String args[]) {      

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JRadioButton dateFilter;
    private javax.swing.JFormattedTextField dateMax;
    private javax.swing.JFormattedTextField dateMin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEmpresas;
    private javax.swing.JComboBox<String> verPorStatus;
    // End of variables declaration//GEN-END:variables
}
