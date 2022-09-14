package Exception_Handlining;

public class Student {

	int rollno;
	String sname;
	String saddress;
	StudentResult srobj;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentResult getSrobj() {
		return srobj;
	}
	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj.getMath() + ", srobj=" + srobj.getPysics() + ", srobj=" + srobj.getChemestry() + "]";
	}
	
	
	
}
