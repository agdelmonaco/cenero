package admin.AlmaceneroProyect.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Client implements Serializable{

	private static final long serialVersionUID = 7581962153597600584L;
	@Id @GeneratedValue
	private Integer id;
	private String name;
	private String surname;
	private String address;
	private String fiscalStatus;
	private Integer fiscalStatusNumber;
	private String description;
	private String keyWords;
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	
	
}
