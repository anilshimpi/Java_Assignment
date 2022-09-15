package CloneMethod;

public class ProductClone {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub

		Product p=new Product();
		p.setPid(11);
		p.setPname("Mobile");
		p.setPrice(20222.45);
		p.setUnitOfMeasurement("100 gram");
		
		Product p1=(Product)p.clone();
		p1.setPname("Laptop");
		p1.setPrice(40560.70);
	
		System.out.println("Product id: "+p.getPid()+" "+"Product name: "+p.getPname()+" "+"Product price: "+p.getPrice()+" "+"Product mesurment: "+p.getUnitOfMeasurement());
		System.out.println("Product id: "+p1.getPid()+" "+"Product name: "+p1.getPname()+" "+"Product price: "+p1.getPrice()+" "+"Product mesurment: "+p1.getUnitOfMeasurement());
	}

}
