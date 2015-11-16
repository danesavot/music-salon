package mum.edu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Eugene
 * @author Dane
 * @author Samy
 *
 */
@Entity
public class Credentials {

	@Id
	@NotEmpty(message = "{NotEmpty}")
	@Column(nullable = false, unique = true)
	String username;
	@NotEmpty(message = "{NotEmpty}")
	@Column(nullable = false)
	String password;
	private String authority;
	Boolean enabled;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
