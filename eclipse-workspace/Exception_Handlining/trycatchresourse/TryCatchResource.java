package Exception_Handlining.trycatchresourse;

import java.io.FileOutputStream;

public class TryCatchResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\anil.shimpi\\eclipse-workspace\\Training Assignment\\src\\Exception_Handlining\\trycatchresourse\\test.txt")){
			
			String s="This is the program for try with Resourses";
			byte arr[] =s.getBytes();
			fos.write(arr);
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Resourse is closed !!!");
	}

}
