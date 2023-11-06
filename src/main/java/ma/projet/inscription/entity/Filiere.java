package ma.projet.inscription.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name="filiere")
public class Filiere {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String Libelle;
	 @OneToMany(mappedBy = "filiere")
	   private List<Student> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	
	

}
