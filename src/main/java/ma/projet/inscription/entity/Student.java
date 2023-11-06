package ma.projet.inscription.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="student")
public class Student extends User {
	private String name;
	private String phone;
	private String email;
	
	 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
	    @JoinColumn(name = "filiere_id")
	    private Filiere filiere;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
