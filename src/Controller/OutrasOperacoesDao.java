/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Funcionarios;
import Model.Utilizadores;
import conexao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import metodos.Testes;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Almerino Buce
 */
public class OutrasOperacoesDao {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public OutrasOperacoesDao() {
        con = ModuloConexao.conector();
    }

//    public void imprimir(String localizacao) {
//        try {
//            JasperPrint print = JasperFillManager.fillReport(localizacao, null, con);
//            JasperViewer.viewReport(print, false);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }

    public void listarFuncionariosParaUtilizadores(JComboBox comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("");
        String sql = "SELECT nrBi FROM funcionarios WHERE status = 'True' and nrbi NOT IN (SELECT funcionarios.nrBi FROM funcionarios, utilizadores WHERE funcionarios.nrBi = utilizadores.nrBi AND funcionarios.status = 'True')";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("nrBi"));
            }
        } catch (Exception e) {
        }
    }

    public void listarViaturasParaParqueamento(JComboBox comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("");
        String sql = "SELECT matricula FROM viaturas WHERE viaturas.status = 'True' AND matricula NOT IN (SELECT viaturas.matricula FROM viaturas, parqueamentos WHERE viaturas.matricula = parqueamentos.matricula AND viaturas.status = 'TRUE' AND parqueamentos.estado = 'ACTIVO')";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("matricula"));
            }
        } catch (Exception e) {
        }
    }

    public void listarVagasParaParqueamento(JComboBox comboBox, String matricula) {
        comboBox.removeAllItems();
        comboBox.addItem("");
        String sql = "Select descricao from vagas where status = 'True' and categoria like ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + matricula + "%");
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("descricao"));
            }
        } catch (Exception e) {
        }
    }

    public void listarClientesContratoParaParqueamento(JComboBox comboBox) {
//        comboBox.removeAllItems();
//        comboBox.addItem("");
        String sql = "SELECT nrBi FROM clientes WHERE contrato = 'Activo' AND clientes.status = 'True' AND nrBI NOT IN (SELECT clientes.nrBI FROM parqueamentos, clientes WHERE parqueamentos.nrBI = clientes.nrBI)";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("nrBI"));
            }
        } catch (Exception e) {
        }
    }

    public void listarClientesContratoParaParqueamentoI(JComboBox comboBox) {
        String sql = "SELECT clientes.nrBi FROM clientes, parqueamentos WHERE parqueamentos.nrBI = clientes.nrBI AND clientes.status = 'True' AND clientes.contrato = 'Activo' AND parqueamentos.estado = 'Inactivo' GROUP BY codCliente";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("nrBI"));
            }
        } catch (Exception e) {
        }
    }

    public void listarClientesSemContratoParaParqueamento(JComboBox comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("");
        String sql = "SELECT nrBi FROM clientes WHERE contrato = 'Inactivo' AND clientes.status = 'True' AND nrBI NOT IN (SELECT clientes.nrBI FROM parqueamentos, clientes WHERE parqueamentos.nrBI = clientes.nrBI)";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("nrBI"));
            }
        } catch (Exception e) {
        }
    }

    public void listarClientesSemContratoParaParqueamentoI(JComboBox comboBox) {
        String sql = "SELECT clientes.nrBi FROM clientes, parqueamentos WHERE parqueamentos.nrBI = clientes.nrBI AND clientes.status = 'True' AND clientes.contrato = 'Inactivo' GROUP BY codCliente";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("nrBI"));
            }
        } catch (Exception e) {
        }
    }

    public void listarParqueamentoParaLevantamento(JComboBox comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("");
        String sql = "SELECT codParqueamento FROM parqueamentos WHERE parqueamentos.status = 'True' AND estado = 'Activo'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("codParqueamento"));
            }
        } catch (Exception e) {
        }

    }

    public void listarBIParqueamentoParaLevantamentoBI(JComboBox comboBox, String cod) {
        comboBox.removeAllItems();
        comboBox.addItem("");
        String sql = "SELECT nrBI, nrBIAlternativo, tipoParqueamento FROM parqueamentos WHERE parqueamentos.status = 'True' AND estado = 'Activo' AND codParqueamento = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cod);
            rs = pst.executeQuery();
            while (rs.next()) {
                comboBox.addItem(rs.getString("nrBI"));
                comboBox.addItem(rs.getString("nrBIAlternativo"));
            }
        } catch (Exception e) {
        }

    }
    Testes t = new Testes();

    public void pegarPrecoVaga(JTextField valor, String cod,String vagaUpdate) {
        String sql = "SELECT vagaDescricao, valor, dataP, horaP FROM parqueamentos, vagas  WHERE parqueamentos.status = 'True'  AND estado = 'Activo'  AND codParqueamento = ? AND vagas.descricao = parqueamentos.vagaDescricao";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cod);
            rs = pst.executeQuery();
            while (rs.next()) {
                double v = t.parqueamento(rs.getString("dataP"), rs.getString("horaP"), Double.parseDouble(rs.getString("valor")));
                valor.setText(String.valueOf(v));
                vagaUpdate = rs.getString("vagaDescricao");
            }
        } catch (Exception e) {
        }

    }

//    public void definirEstadoParqueamentoValor(JTextField valor, String cod) {
//        String sql = "SELECT nrBI, nrBIAlternativo, tipoParqueamento FROM parqueamentos WHERE parqueamentos.status = 'True' AND estado = 'Activo' AND codParqueamento = ?";
//        try {
//            pst = con.prepareStatement(sql);
//            pst.setString(1, cod);
//            rs = pst.executeQuery();
//            while (rs.next()) {
//                comboBox.addItem(rs.getString("nrBI"));
//                comboBox.addItem(rs.getString("nrBIAlternativo"));
//            }
//        } catch (Exception e) {
//        }
//
//    }
    public void actualizarEstadoVaga(String vaga) {
        String sql = "update vagas set status = ? where descricao = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "False");
            pst.setString(2, vaga);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void actualizarEstadoVagaTrue(String vaga) {
        String sql = "update vagas set status = ? where descricao = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "True");
            pst.setString(2, vaga);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void actualizarEstadoParqueamento(String cod) {
        String sql = "update parqueamentos set estado = ? where codParqueamento = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "Inactivo");
            pst.setString(2, cod);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void actualizarParqueamento(String nrBI, String nome, int cod) {
        String sql = "update parqueamentos set nrBIAlternativo  = ?, nomeAlternativo = ? where codParqueamento = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nrBI);
            pst.setString(2, nome);
            pst.setInt(3, cod);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void apagarParqueamento(int cod) {
        String sql = "update parqueamentos set status = 'False' where codParqueamento = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, cod);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
}
