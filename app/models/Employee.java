package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Employee extends Model {

	private static final long serialVersionUID = -6230157247620041691L;

	@Id
	private Long id;

	@Required
	private String name;

	@Required
	private String firstName;

	private Integer workHours;

	private Integer payout;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getWorkHours() {
		return workHours;
	}

	public void setWorkHours(Integer workHours) {
		this.workHours = workHours;
	}

	public Integer getPayout() {
		return payout;
	}

	public void setPayout(Integer payout) {
		this.payout = payout;
	}
}