package inheritancePrograms;

public class Mobile extends Electronics {
	
	int mobileId;
	String mobileName;
	public Mobile(int id, String semiconductorType, String dateOfManufacturing, int mobileId, String mobileName) {
		super(id, semiconductorType, dateOfManufacturing);
		this.mobileId = mobileId;
		this.mobileName = mobileName;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", id=" + id + ", semiconductorType="
				+ semiconductorType + ", dateOfManufacturing=" + dateOfManufacturing + "]";
	}
	
	
}
