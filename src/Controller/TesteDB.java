/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.Func;
import Model.Funcionario;
import Model.Vagas;
import Model.Via;
import Model.Viatura;
import Model.Viaturas;
import javax.swing.JOptionPane;
import static metodos.StringToDate.converterLocal;

/**
 *
 * @author hp
 */
public class TesteDB {

    public static void main(String[] args) {
        GeralDAO<Via> gv = new GeralDAO<>();
//        GeralDAO<Func> gf = new GeralDAO<>();
//        Func func = new Func();
//        func.setNrBi("136517G");
//        func.setNomeCompleto("Buce");
//        func.setSexo("Masculino");
//        func.setMorada("Magoanine C");
//        func.setCargo("IT Master");
//        func.setDepartamento("TIC's");
//        func.setContacto("844472093");
//        func.setDataNascimento("10-07-1998");
//        func.setEmail("MozerBucee@gmail.com");
//        gf.salvar(func);
//        
//        gd.salvar(t);

//        Cliente cli = new Cliente();
//        cli.setContacto("2346");
////        cli.setDataNascimento("2000-03-15");
//        cli.setMorada("wfweyt");
//        cli.setNomeCompleto("wegkfweyhfywe");
//        cli.setNrBi("wedtgeh");
//        //cli.setSexo("as");
//        
//        GeralDAO<Cliente> dao = new GeralDAO<>();
//        dao.salvar(cli);
//        
//        JOptionPane.showMessageDialog(null, "Funcionou");
//        Via via = new Via();
//        via.setMatricula("fgh");
//
//        via.setCodChassi("2");
//
//        via.setCodMotor("wde");
//        via.setCor("ama");
//        via.setEstado("nice");
//        via.setFabricante("ele");
//        via.setModelo("sj");
//        via.setTipo("ss");
//        gv.salvar(via);
//        JOptionPane.showMessageDialog(null, "Funcionou");

        //viatura.setStatus("True");
//        gd.apagar(t);
//       gd.salvar(via);
         Vagas vagas = new Vagas();
        GeralDAO<Vagas> gd = new GeralDAO<>();
        vagas.setCategoria("Ligeiros");
        vagas.setDescricao("L1");
        vagas.setValor(200);
        gd.salvar(vagas);
    }
}
