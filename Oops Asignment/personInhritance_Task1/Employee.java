package personInhritance;

public class Employee {

	String date_of_joining;
	String base_location;
	String contact_name;
	String emialid;
	Department deptobj;

	@Override
	public String toString() {
		return "Employee [date_of_joining=" + date_of_joining + ", base_location=" + base_location + ", contact_name="
				+ contact_name + ", emialid=" + emialid + ", deptobj=" + deptobj + ", getDate_of_joining()="
				+ getDate_of_joining() + ", getBase_location()=" + getBase_location() + ", getContact_name()="
				+ getContact_name() + ", getEmialid()=" + getEmialid() + ", getDeptobj()=" + getDeptobj()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getEmialid() {
		return emialid;
	}

	public void setEmialid(String emialid) {
		this.emialid = emialid;
	}

	public Department getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}

	public Employee(String date_of_joining, String base_location, String contact_name, String emialid,
			Department deptobj) {
		super();
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.contact_name = contact_name;
		this.emialid = emialid;
		this.deptobj = deptobj;
	}

	
}
