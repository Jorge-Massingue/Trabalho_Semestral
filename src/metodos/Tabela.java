/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Almerino Buce
 */
public class Tabela {

    public void limpaJtable(JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        int linhas = model.getRowCount();
        for (int i = linhas - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

}
