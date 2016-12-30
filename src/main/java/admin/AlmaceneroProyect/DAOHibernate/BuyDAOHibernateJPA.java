package admin.AlmaceneroProyect.DAOHibernate;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import admin.AlmaceneroProyect.DAO.BuyDAO;
import admin.AlmaceneroProyect.model.Buy;

public class BuyDAOHibernateJPA extends GenericDAOHibernateJPA<Buy> implements BuyDAO{

	public BuyDAOHibernateJPA(Class <Buy> buy ){
		super(buy);
	}
	
	public BuyDAOHibernateJPA(){
		super(Buy.class);
	}
	
	@Transactional
	public List<Buy> getAllBuyForUser(Integer userId){
		String query = "SELECT e  FROM Buy e WHERE e.userId LIKE :custuserId ";
		Query consult = this.entityManager.createQuery(query);
		consult.setParameter("custuserId", userId);
		List<Buy> results = (List<Buy>)consult.getResultList();
		return results;
	}
	
	public Buy getBuyForId(Serializable id){
		String query = "SELECT e FROM Buy e WHERE e.id LIKE custid";
		Query consult = this.entityManager.createQuery(query);
		consult.setParameter("custid", id);
		Buy result = (Buy)consult.getResultList();
		return result;
	}
	
	public List<Buy> getAllBuyForIdProvider(Integer id){
		String query = "SELECT e FROM Buy e WHERE e.idProvider LIKE custidProvider";
		Query consult = this.entityManager.createQuery(query);
		consult.setParameter("custidProvider", id);
		List<Buy> result = (List<Buy>)consult.getResultList();
		return result;
	}
	public List<Buy> getAllBuyFormIdProduct(Integer id){
		String query = "SELECT e FROM Buy e WHERE  e..id LIKE custProductid in elements(e.idProducts)";
		Query consult = this.entityManager.createQuery(query);
		consult.setParameter("custProductid", id);
		List<Buy> result = (List<Buy>)consult.getResultList();
		return result;
	}
	
}

