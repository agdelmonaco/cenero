package admin.AlmaceneroProyect.DAO;

import java.io.Serializable;

import admin.AlmaceneroProyect.model.Buy;
import admin.AlmaceneroProyect.model.BuyProduct;

public interface BuyProductDAO {

	public BuyProduct insertElement(Integer idBuy, Integer idProduct);
	public void deleteElement(Integer idBuy, Integer idProduct);
	public Buy getElement(Serializable idBuy, Integer idProduct);
	public Buy deleteElement(Serializable idBuy, Serializable idProduct);
	public Boolean existElement(Serializable idBuy, Serializable idProduct);
}
