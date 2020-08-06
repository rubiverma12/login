package rentsells.login.model;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "login")
public class Login {
  @Id
  private Long id;
/*  
  @NotBlank
  @Size(max = 20)
  private String username;*/

  @NotBlank
  @Size(max = 20)
  private String mobile;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 100)
  private String password;

  @DBRef
  private Set<Role> roles = new HashSet<>();
  
  @NotBlank
  @Size(max = 30)
  private String status;



public Login() {
  }

  public Login(String mobile, String email, String password,String status,Set<Role> roles) {
    this.mobile = mobile;
    this.email = email;
    this.password = password;
    this.status = status;
    this.roles = roles;
  }
  
  public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMobile() {
    return mobile;
  }

 /* public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}*/
	
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

@Override
public String toString() {
	return "Login [id=" + id + ", mobile=" + mobile + ", email=" + email + ", password=" + password + ", roles=" + roles
			+ ", status=" + status + "]";
}

  
  
  
}
