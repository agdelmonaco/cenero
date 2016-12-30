package admin.AlmaceneroProyect.model;

import java.math.BigDecimal;
import java.sql.Date;

public class ProviderProduct {
	private Integer idProvider;
	private Integer idProduct;
	private BigDecimal providerPrice;
	private BigDecimal gamePercentage;
	private Date roudUpdatingStamp;
	
	
	public Integer getIdProvider() {
		return idProvider;
	}
	public void setIdProvider(Integer idProvider) {
		this.idProvider = idProvider;
	}
	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	public BigDecimal getProviderPrice() {
		return providerPrice;
	}
	public void setProviderPrice(BigDecimal providerPrice) {
		this.providerPrice = providerPrice;
	}
	public Date getRoudUpdatingStamp() {
		return roudUpdatingStamp;
	}
	public void setRoudUpdatingStamp(Date roudUpdatingStamp) {
		this.roudUpdatingStamp = roudUpdatingStamp;
	}
	
}
