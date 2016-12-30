package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.Product;

public interface ProductDAO {

	public Product insertElement(Product element);
	public void deleteElement(Product element);
	public Product updateElement(Product element);
	public Product getElement(Serializable id);
	public Product deleteElement(Serializable id);
	public Boolean existElement(Serializable id);
}
