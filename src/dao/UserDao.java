package dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.User;
import utility.HibernateConnectionManager;

public class UserDao implements UserDaoInterface {

	private SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();

	@Override
	public int signup(User user) throws ClassNotFoundException {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if (session.save(user) != null) {
			transaction.commit();
			session.close();
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean loginUser(User user) throws ClassNotFoundException {

		Session session = this.sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = (Transaction) session.getTransaction();
			tx.begin();
			Query query = session.createQuery(
					"from User where email='" + user.getEmail() + "'" + "and password='" + user.getPassword() + "'");
			user = (User) ((org.hibernate.query.Query) query).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				try {
					tx.rollback();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return true;
	}

}
