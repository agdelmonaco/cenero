package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.Provider;

public interface ProviderDAO {

	public Provider insertElement(Provider element);
	public void deleteElement(Provider element);
	public Provider updateElement(Provider element);
	public Provider getElement(Serializable id);
	public Provider deleteElement(Serializable id);
	public Boolean existElement(Serializable id);
}
