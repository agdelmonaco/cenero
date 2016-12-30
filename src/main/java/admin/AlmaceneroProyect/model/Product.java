package admin.AlmaceneroProyect.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

public class Product implements Serializable {

	private static final long serialVersionUID = -7323780912623384546L;

	@Id @GeneratedValue
	private Integer id;
	private String keysWords;
	private String description;
	private Integer stock;
	private BigDecimal priceForSale;
	private String code;
	private Integer idCategory;
	private byte[] image;
	private Integer idProvider;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdProvider() {
		return idProvider;
	}
	public void setIdProvider(Integer idProvider) {
		this.idProvider = idProvider;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKeysWords() {
		return keysWords;
	}
	public void setKeysWords(String keysWords) {
		this.keysWords = keysWords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public BigDecimal getPriceForSale() {
		return priceForSale;
	}
	public void setPriceForSale(BigDecimal priceForSale) {
		this.priceForSale = priceForSale;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	
	
	
}
