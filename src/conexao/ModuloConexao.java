/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Almerino Buce
 */

/**
 * Classe que contem os modulos para a conexao com a base de dados
 */
public class ModuloConexao {

    public static com.mysql.jdbc.Connection Conector() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
/**
 * Metodo que permite fazer a conexao com a base de dados
 * @return objecto do tipo conexao, neste caso da propria clase
 */
    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mySQL://localhost:3306/Verdant";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão feita com sucesso");
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão de" + e.getMessage());
            return null;
        }
    }

}
