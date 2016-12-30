package admin.AlmaceneroProyect.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Provider implements Serializable {

	private static final long serialVersionUID = 404280685910343047L;

	@Id @GeneratedValue
	private Integer id;
	private String description;
	private String name;
	private String surname;
	private String email;
	private Integer idCategory;
	private String address;
	private Integer telephone;
	private String fiscalStatus;
	private Integer fiscalStatusNumber;
	private String keyWords;

	
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFiscalStatus() {
		return fiscalStatus;
	}
	public void setFiscalStatus(String fiscalStatus) {
		this.fiscalStatus = fiscalStatus;
	}
	public Integer getFiscalStatusNumber() {
		return fiscalStatusNumber;
	}
	public void setFiscalStatusNumber(Integer fiscalStatusNumber) {
		this.fiscalStatusNumber = fiscalStatusNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}
	
	
	
}
