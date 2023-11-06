package ma.projet.inscription.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name= "User")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
	protected String name;
	protected String password;
	  @ManyToMany
	    @JoinTable(name = "user_role",
	            joinColumns = @JoinColumn(name = "user_id"),
	            inverseJoinColumns = @JoinColumn(name = "role_id"))
	    private Set<Role> roles = new HashSet<>();

	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	

}
