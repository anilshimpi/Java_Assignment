package personInhritance;

public class Customer extends Person {

	public Customer(int pid, String pname, String paddress, String dob) {
		super(pid, pname, paddress, dob);
		// TODO Auto-generated constructor stub
	}
     
	
	@Override
	public String toString() {
		return "Customer [date_of_registration=" + date_of_registration + ", delivery_address=" + delivery_address
				+ ", contactno=" + contactno + ", email_id=" + email_id + ", getDate_of_registration()="
				+ getDate_of_registration() + ", getDelivery_address()=" + getDelivery_address() + ", getContactno()="
				+ getContactno() + ", getEmail_id()=" + getEmail_id() + ", getPid()=" + getPid() + ", getPname()="
				+ getPname() + ", getPaddress()=" + getPaddress() + ", getDob()=" + getDob() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	String date_of_registration;
	String delivery_address;
	String contactno;
	String email_id;

	public String getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
