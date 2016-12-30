package admin.AlmaceneroProyect.DAOHibernate;

import java.io.Serializable;

import admin.AlmaceneroProyect.DAO.BuyProductDAO;
import admin.AlmaceneroProyect.model.Buy;
import admin.AlmaceneroProyect.model.BuyProduct;

public class BuyProductDAOHibernateJPA extends GenericDAOHibernateJPA<BuyProduct> implements BuyProductDAO{

	public BuyProductDAOHibernateJPA(Class <BuyProduct> buy ){
		super(buy);
	}
	
	public BuyProductDAOHibernateJPA(){
		super(BuyProduct.class);
	}

	public BuyProduct insertElement(Integer idBuy, Integer idProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteElement(Integer idBuy, Integer idProduct) {
		// TODO Auto-generated method stub
		
	}

	public Buy getElement(Serializable idBuy, Integer idProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	public Buy deleteElement(Serializable idBuy, Serializable idProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean existElement(Serializable idBuy, Serializable idProduct) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
