package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.Client;

public interface ClientDAO {

	public Client insertElement(Client element);
	public void deleteElement(Client element);
	public Client updateElement(Client element);
	public Client getElement(Serializable id);
	public Client deleteElement(Serializable id);
	public Boolean existElement(Serializable id);
}
