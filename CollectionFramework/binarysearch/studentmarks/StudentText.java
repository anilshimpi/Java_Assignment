package CollectionFramework.binarysearch.studentmarks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentText {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of student you want to add:");
		int num=sc.nextInt();
		
		int totalmarks;
		
		int i=0;
		
		for(i=0;i<num;i++) {
			list.add(new Student());
		}
		
		for(i=0;i<num;i++) {
			
			System.out.println("Enter roll number: ");
			list.get(i).setRollno(sc.nextInt());
			System.out.println("Enter student name: ");
			list.get(i).setSname(sc.next());
			sc.nextLine();
			System.out.println("Enter class name: ");
			list.get(i).setClassname(sc.next());
			sc.nextLine();
			System.out.println("Enter total marks: ");
			list.get(i).setTotalmarks(sc.nextInt());
			sc.nextLine();	
			
		}
		
		int position=0;
		totalmarks=list.get(0).getTotalmarks();
		
		for(i=0;i<num;i++) {
			if(totalmarks<list.get(i).getTotalmarks()) {
				totalmarks=list.get(i).getTotalmarks();
				position=i;
			}
			//Collections.sort(list.get(i).getTotalmarks());
			
		}
		
		System.out.println("Secure first rank: Roll No: "+list.get(position).getRollno()+"\nStudent name:"+list.get(position).getSname()+"\nClass name: "+list.get(position).getClassname()+"\nTotal marks: "+list.get(position).getTotalmarks());
	}
		
}
