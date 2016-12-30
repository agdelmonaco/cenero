package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.Buy;

public interface BuyDAO {

	public Buy insertElement(Buy element);
	public void deleteElement(Buy element);
	public Buy updateElement(Buy element);
	public Buy getElement(Serializable id);
	public Buy deleteElement(Serializable id);
	public Boolean existElement(Serializable id);
}
