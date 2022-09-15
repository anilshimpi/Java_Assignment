package ShapeTriangle;

public class Result {
	public static void main(String[] args) {

		Shape sp;

		sp = new Triangle();
		System.out.println("area of Triangle= " + sp.area());

		sp = new Square();
		System.out.println("area of Square= " + sp.area());

		sp = new Rectangle();
		System.out.println("area of Rectangle= " + sp.area());
	}
}
