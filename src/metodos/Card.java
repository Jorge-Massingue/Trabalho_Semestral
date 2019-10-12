/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import View.FormFuncionario;
import View.FormUtilizador;
import java.awt.CardLayout;
import javax.swing.SwingUtilities;
import View.PainelMenu;
import javax.swing.JPanel;

/**
 *
 * @author Almerino Buce
 */
public class Card {

    CardLayout cardLayout;
    
  

    public void chamarPainel(JPanel painel,JPanel painelAbrir) {
        painel.removeAll();
        painel.add(painelAbrir);
        painel.repaint();
        painel.revalidate();
    }
}
