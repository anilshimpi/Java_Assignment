package inheritancePrograms;

public class LCD extends Electronics {

	int lcdId;
	String lcdName;
	
	public LCD(int id, String semiconductorType, String dateOfManufacturing, int lcdId, String lcdName) {
		super(id, semiconductorType, dateOfManufacturing);
		this.lcdId = lcdId;
		this.lcdName = lcdName;
	}

	@Override
	public String toString() {
		return "LCD [lcdId=" + lcdId + ", lcdName=" + lcdName + ", id=" + id + ", semiconductorType="
				+ semiconductorType + ", dateOfManufacturing=" + dateOfManufacturing  + "]";
	}
	
	
	
}
