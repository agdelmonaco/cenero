package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.Category;

public interface CategoryDAO {

	public Category insertElement(Category element);
	public void deleteElement(Category element);
	public Category updateElement(Category element);
	public Category getElement(Serializable id);
	public Category deleteElement(Serializable id);
	public Boolean existElement(Serializable id);
}
