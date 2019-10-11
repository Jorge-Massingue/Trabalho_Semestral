/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Teste;

/**
 *
 * @author hp
 */
public class TesteDB {
    public static void main(String[] args) {
        
        Teste t = new Teste();
        
//        t.setId(8);
//        t.setNome("hhh");
        
        GeralDAO gd = new GeralDAO();
        
        //gd.salvar(t);
        gd.apagar(t);
    }
}
