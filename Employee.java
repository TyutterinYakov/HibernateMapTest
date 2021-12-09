package entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="em_id")
	private Long emId;
	@Column(name="first_name",length=100)
	private String firstName;
	@Column(name="last_name", length=100)
	private String lastName;
	@Column(name="birthday")
	private Date birthday;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
			name="empl_proj",
			joinColumns =@JoinColumn(name="employee_id"),
			inverseJoinColumns = @JoinColumn(name="project_id")
			)
	private Set<Project> projects;
	
	public Employee() {
		
	}
	

	public Long getEmId() {
		return emId;
	}


	public void setEmId(Long emId) {
		this.emId = emId;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return emId+" "+firstName+" "+lastName+" "+birthday+" "+address+" "+projects;
	}
	
	
	
	
}
