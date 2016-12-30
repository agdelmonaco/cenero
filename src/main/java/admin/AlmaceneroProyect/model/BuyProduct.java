package admin.AlmaceneroProyect.model;

import javax.persistence.Column;

public class BuyProduct {

	@Column(nullable=false)
	private Integer idProduct;
	@Column(nullable=false)
	private Integer idBuy;
	
	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	public Integer getIdBuy() {
		return idBuy;
	}
	public void setIdBuy(Integer idBuy) {
		this.idBuy = idBuy;
	}
	
	
}
