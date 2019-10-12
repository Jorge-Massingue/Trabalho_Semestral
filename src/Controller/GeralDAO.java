package Controller;

//import Modelo.Cliente;
import Model.Clientes;
import Model.Funcionarios;
import Model.Parqueamentos;
import Model.Utilizadores;
import Model.Vagas;
import Model.Viaturas;
import Util.HibernateUtil;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author george
 */
public class GeralDAO<O> {

    public boolean salvar(O o) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        try {
            s.saveOrUpdate(o);
            tx.commit();
            return true;

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        } finally {
            s.close();
//            sf.close();
        }
    }

    public boolean apagar(O o) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        try {
            s.delete(o);
            tx.commit();
            return true;

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        } finally {
            s.close();
            sf.close();
        }
    }

    public boolean editar(O o) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        try {
            s.update(o);
            tx.commit();
            return true;

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        } finally {
            s.close();
//            sf.close();
        }

    }

    public static ArrayList<Utilizadores> listarUtilizadores() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Utilizadores> utilizadores = new ArrayList<>();
        try {
            Transaction t = s.beginTransaction();
            Criteria cr = s.createCriteria(Utilizadores.class);
            utilizadores = (ArrayList<Utilizadores>) cr.list();
            t.commit();
            return utilizadores;
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            return null;
        } finally {
            s.close();
        }
    }

    public static ArrayList<Funcionarios> listarFuncionarios() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        try {
            Transaction t = s.beginTransaction();
            Criteria cr = s.createCriteria(Funcionarios.class);
            funcionarios = (ArrayList<Funcionarios>) cr.list();
            t.commit();
            return funcionarios;
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            return null;
        } finally {
            s.close();
        }
    }
    public static ArrayList<Clientes> listarClientes() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Clientes> clientes = new ArrayList<>();
        try {
            Transaction t = s.beginTransaction();
            Criteria cr = s.createCriteria(Clientes.class);
            clientes = (ArrayList<Clientes>) cr.list();
            t.commit();
            return clientes;
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            return null;
        } finally {
            s.close();
        }
    }
    public static ArrayList<Viaturas> listarViaturas() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Viaturas> viaturas = new ArrayList<>();
        try {
            Transaction t = s.beginTransaction();
            Criteria cr = s.createCriteria(Viaturas.class);
            viaturas = (ArrayList<Viaturas>) cr.list();
            t.commit();
            return viaturas;
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            return null;
        } finally {
            s.close();
        }
    }
    public static ArrayList<Parqueamentos> listarParqueamentos() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Parqueamentos> parqueamentos = new ArrayList<>();
        try {
            Transaction t = s.beginTransaction();
            Criteria cr = s.createCriteria(Parqueamentos.class);
            parqueamentos = (ArrayList<Parqueamentos>) cr.list();
            t.commit();
            return parqueamentos;
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            return null;
        } finally {
            s.close();
        }
    }
    public static ArrayList<Vagas> listarVagas() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Vagas> vagas = new ArrayList<>();
        try {
            Transaction t = s.beginTransaction();
            Criteria cr = s.createCriteria(Vagas.class);
            vagas = (ArrayList<Vagas>) cr.list();
            t.commit();
            return vagas;
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            return null;
        } finally {
            s.close();
        }
    }

    public static void main(String[] args) {
        for (Utilizadores u : listarUtilizadores()) {
            System.out.println(u);
        }
    }

    
}
