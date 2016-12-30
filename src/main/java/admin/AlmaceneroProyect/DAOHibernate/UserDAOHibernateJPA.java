package admin.AlmaceneroProyect.DAOHibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Transactional;

import admin.AlmaceneroProyect.DAO.UserDAO;
import admin.AlmaceneroProyect.model.User;

public class UserDAOHibernateJPA extends GenericDAOHibernateJPA<User> implements UserDAO{

	public UserDAOHibernateJPA(Class<User> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public UserDAOHibernateJPA(){
		
		super(User.class);
	}

	@Transactional
	public User existUser(String userName, String password) {
		Query consult = this.entityManager.createQuery("SELECT e  FROM User e WHERE e.userName LIKE :custname AND e.password LIKE :custpass");
		consult.setParameter("custname", userName);
		consult.setParameter("custpass", password);	
		consult.setMaxResults(1);
		List<User> results = (List<User>)consult.getResultList();
		if(!results.isEmpty()){
			User result = results.get(0);
			return result;
		}
		else
		{
			return null;
		}
		
	}
	
	@Transactional
	public Map<Integer,String> listAllUserNames() {
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Tuple> cq = cb.createTupleQuery();
		Root<User> root = cq.from(User.class);
		cq.multiselect(root.get("userId"), root.get("userName"));
		Query consult = this.entityManager.createQuery(cq);
		Map<Integer,String> results = new HashMap<Integer,String>();
		results.put(0,"Seleccione un usuario");
		List<Tuple> tupleResult = consult.getResultList();		
		if(!tupleResult.isEmpty()){
			for (Tuple t : tupleResult) {
				results.put((Integer) t.get(0),(String) t.get(1));
			}
		}
		
		return results;
	}
}
