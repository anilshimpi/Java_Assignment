package inheritancePrograms;



public class Electronics {
	int id;
	String semiconductorType;
	String dateOfManufacturing;
	
	
	
	public Electronics(int id, String semiconductorType, String dateOfManufacturing) {
		super();
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}



	public static void main(String[] args) {
		

		Electronics laptop=new Laptop(11, "LCD", "2018", 111, "Lenevo");
		System.out.println(laptop.toString());
		Electronics lcd=new LCD(12, "Selicon", "2019", 121, "LG");
		System.out.println(lcd.toString());
		Electronics mob= new Mobile(131, "Chip", "2022", 131, "Xiomi");
		System.out.println(mob.toString());
		
		
		
		
	}

}
