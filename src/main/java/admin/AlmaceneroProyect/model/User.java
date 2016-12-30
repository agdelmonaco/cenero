package admin.AlmaceneroProyect.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable{

	private static final long serialVersionUID = 6736068502868171044L;

	//Attributes
	@Id @GeneratedValue
	private Integer idUser;
	
	@Column(unique=true, nullable=false)
	private String name;
			
	@Column(nullable=false)
	private String password;

	@Column(nullable=false)
	private Integer rol;
	
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRol() {
		return rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}

	
}
