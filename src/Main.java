import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

/**
 * @author DayoWong on 2018/8/26
 */
public class Main {

//    private static final SessionFactory ourSessionFactory;
//
//    static {
//        try {
//            Configuration configuration = new Configuration();//需要配置hibernate.cfg
//            configuration.configure();
//
//            ourSessionFactory = configuration.buildSessionFactory();
//        } catch (Throwable ex) {
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    private static Session getSession() throws HibernateException {
//        return ourSessionFactory.openSession();
//    }
//
//    public static void main(final String[] args) throws Exception {
//        try (Session session = getSession()) {
//            System.out.println("querying all the managed entities...");
//            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
//            for (EntityType<?> entityType : metamodel.getEntities()) {
//                final String entityName = entityType.getName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o);
//                }
//            }
//        }
//    }
}