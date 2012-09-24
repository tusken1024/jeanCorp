package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang.StringUtils;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Manager extends Model {

	private static final long serialVersionUID = -5307644880100609692L;

	@Id
	private Long id;

	@Required
	private String login;

	@Required
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String validate() {
		if (StringUtils.equalsIgnoreCase(login, "admin")
				&& StringUtils.equalsIgnoreCase(password, "admin")) {
			return null;
		}
		return "OK";
	}
}
