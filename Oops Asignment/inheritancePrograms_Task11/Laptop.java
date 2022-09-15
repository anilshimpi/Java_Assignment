package inheritancePrograms;

public class Laptop extends Electronics{
	
	int laptopId;
	String laptopName;
	
	public Laptop(int id, String semiconductorType, String dateOfManufacturing, int laptopId, String laptopName) {
		super(id, semiconductorType, dateOfManufacturing);
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}
	
	

	

	public int getLaptopId() {
		return laptopId;
	}



	public String getLaptopName() {
		return laptopName;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", id=" + id + ", semiconductorType="
				+ semiconductorType + ", dateOfManufacturing=" + dateOfManufacturing + "]";
	}


	
	

	
	

}
