package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ad_id")
	private Long adId;
	
	@Column(name="country",length=100)
	private String country;
	@Column(name="city",length=100)
	private String city;
	@Column(name="street",length=100)
	private String street;
	@Column(name="post_code",length=10)
	private String postCode;
	
	public Address() {
		
	}



	public Long getAdId() {
		return adId;
	}



	public void setAdId(Long adId) {
		this.adId = adId;
	}



	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		
		return adId+" "+country+" "+city+" "+street+" "+postCode;
	}
	
	
	
	
}
