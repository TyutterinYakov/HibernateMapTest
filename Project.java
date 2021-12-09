package entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pr_id")
	private Long prId;
	@Column(name="title")
	private String title;
	@ManyToMany(mappedBy="projects")
	private Set<Employee> employees;
	
	public Project() {
		
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return prId+" "+title;
	}


	public Long getPrId() {
		return prId;
	}


	public void setPrId(Long prId) {
		this.prId = prId;
	}
	
}
