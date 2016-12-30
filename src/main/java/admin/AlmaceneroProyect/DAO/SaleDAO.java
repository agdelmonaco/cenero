package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.Sale;

public interface SaleDAO {

	public Sale insertElement(Sale element);
	public void deleteElement(Sale element);
	public Sale updateElement(Sale element);
	public Sale getElement(Serializable id);
	public Sale deleteElement(Serializable id);
	public Boolean existElement(Serializable id);
}
