package Controller;

//import Modelo.Cliente;
import Util.HibernateUtil;
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
            s.save(o);
            tx.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
//            s.close();
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
            sf.close();
        }
    }

}
