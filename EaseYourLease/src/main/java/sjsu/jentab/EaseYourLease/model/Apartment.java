package sjsu.jentab.EaseYourLease.model;

import javax.persistence.*;

@Entity
@Table(name = "Apartment")
public class Apartment {

		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		private String apartmentName;
		private String addressLine1;
		private String addressLine2;
		private String city;
		private String state;
		private String country;
		private String code;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getApartmentName() {
			return apartmentName;
		}
		public void setApartmentName(String apartmentName) {
			this.apartmentName = apartmentName;
		}

		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}

		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
}
