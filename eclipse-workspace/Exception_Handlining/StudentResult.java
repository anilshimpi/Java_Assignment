package Exception_Handlining;

public class StudentResult {

	int math;
	int pysics;
	int chemestry;
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getPysics() {
		return pysics;
	}
	public void setPysics(int pysics) {
		this.pysics = pysics;
	}
	public int getChemestry() {
		return chemestry;
	}
	public void setChemestry(int chemestry) {
		this.chemestry = chemestry;
	}
	
	public int result() {
		
	
		int marks=(math+chemestry+pysics)/3;
		
		if(math<0||chemestry<0||pysics<0)
			throw new ResultException("Negative");
		
		else if(marks<40) {
			System.out.println("Result: FAIL");
			throw new ResultException("Student below 40 percent");
		}
		
		else
		System.out.println("Result= Pass");
		return marks;
		}
		
	}
	

