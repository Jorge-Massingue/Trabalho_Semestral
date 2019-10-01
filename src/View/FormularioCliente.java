/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Almerino Buce
 */
public class FormularioCliente extends javax.swing.JPanel {

    /**
     * Creates new form Exemplar1
     */
    public FormularioCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelContacto = new javax.swing.JLabel();
        textFieldContacto = new javax.swing.JTextField();
        labelNumBi = new javax.swing.JLabel();
        textFiledNumBi = new javax.swing.JTextField();
        labelMorada = new javax.swing.JLabel();
        TextFieldMorada = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        RadioButtonSexoFem = new javax.swing.JRadioButton();
        RadioButtonSexoMasc = new javax.swing.JRadioButton();
        labelVaga = new javax.swing.JLabel();
        ComboBoxVaga = new javax.swing.JComboBox<>();
        ButtonSalvar = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonList = new javax.swing.JButton();
        ButtonEnable = new javax.swing.JButton();
        ButtonUnable = new javax.swing.JButton();
        TabbedPaneCliente = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        ButtonSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(940, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1254, 798));

        labelNome.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        labelNome.setText("Nome");

        textFieldNome.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N

        labelContacto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        labelContacto.setText("Contacto");

        textFieldContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContactoActionPerformed(evt);
            }
        });

        labelNumBi.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        labelNumBi.setText("Numero de BI");

        textFiledNumBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFiledNumBiActionPerformed(evt);
            }
        });

        labelMorada.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        labelMorada.setText("Morada");

        labelGenero.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        labelGenero.setText("Genero");

        RadioButtonSexoFem.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        RadioButtonSexoFem.setText("Feminino");

        RadioButtonSexoMasc.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        RadioButtonSexoMasc.setText("Masculino");

        labelVaga.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        labelVaga.setText("Vaga a ocupar");

        ComboBoxVaga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Add.png"))); // NOI18N

        ButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        ButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Update.png"))); // NOI18N

        ButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Delete.png"))); // NOI18N
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        ButtonList.setBackground(new java.awt.Color(255, 255, 255));
        ButtonList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/List.png"))); // NOI18N
        ButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonListActionPerformed(evt);
            }
        });

        ButtonEnable.setBackground(new java.awt.Color(255, 255, 255));
        ButtonEnable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Enable.png"))); // NOI18N

        ButtonUnable.setBackground(new java.awt.Color(255, 255, 255));
        ButtonUnable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Unable.png"))); // NOI18N
        ButtonUnable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUnableActionPerformed(evt);
            }
        });

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Contacto", "Morada", "BI", "Vaga", "Estado"
            }
        ));
        jScrollPane2.setViewportView(TableCliente);

        TabbedPaneCliente.addTab("Tabela Cliente", jScrollPane2);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        ButtonSearch.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Search.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TabbedPaneCliente)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMorada)
                            .addComponent(TextFieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadioButtonSexoFem)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButtonSexoMasc)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFiledNumBi)
                            .addComponent(ComboBoxVaga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNumBi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 329, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ButtonList, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonEnable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonUnable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNumBi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFiledNumBi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(labelMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(labelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonSexoFem)
                    .addComponent(RadioButtonSexoMasc))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonList, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEnable, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonUnable, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(TabbedPaneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFiledNumBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFiledNumBiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFiledNumBiActionPerformed

    private void textFieldContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldContactoActionPerformed

    private void ButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonListActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonUnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUnableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonUnableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEnable;
    private javax.swing.JButton ButtonList;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JButton ButtonUnable;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JComboBox<String> ComboBoxVaga;
    private javax.swing.JRadioButton RadioButtonSexoFem;
    private javax.swing.JRadioButton RadioButtonSexoMasc;
    private javax.swing.JTabbedPane TabbedPaneCliente;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTextField TextFieldMorada;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelContacto;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelMorada;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumBi;
    private javax.swing.JLabel labelVaga;
    private javax.swing.JTextField textFieldContacto;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFiledNumBi;
    // End of variables declaration//GEN-END:variables
}