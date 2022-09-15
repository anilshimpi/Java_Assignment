package personInhritance;

public class Person {

	private int pid;
	private String pname;
	private String paddress;
	private String dob;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Person(int pid, String pname, String paddress, String dob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
	}

}
