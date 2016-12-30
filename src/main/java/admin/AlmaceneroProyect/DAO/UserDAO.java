package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.User;

public interface UserDAO {

	public User insertElement(User element);
	public void deleteElement(User element);
	public User updateElement(User element);
	public User getElement(Serializable id);
	public User deleteElement(Serializable id);
	public Boolean existElement(Serializable id);
}
