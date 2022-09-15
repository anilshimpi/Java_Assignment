package CollectionFramework.studentmarks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentText {
	
	List<Student> l = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int totalmark;
	int count = 0;
	int no;

	public void addStudent() {
		System.out.println("Enter no of student you want to add");
		no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			Student s = new Student();
			System.out.println("Enter stu rollno: ");
			s.setRollno(sc.nextInt());
			System.out.println("Enter stu name: ");
			s.setSname(sc.next());
			System.out.println("Enter stu classname: ");
			s.setClassname(sc.next());
			System.out.println("Enter stu total mark: ");
			s.setTotalmarks(sc.nextInt());

			l.add(s);
			count++;
		}
	}

	public void getSecureFirst() {
		if (count > 0) {

			int position = 0;
			totalmark = l.get(0).getTotalmarks();

			for (int i = 0; i < no; i++) {
				if (totalmark < l.get(i).getTotalmarks()) {
					totalmark = l.get(i).getTotalmarks();
					position = i;
				}

			}
			System.out.println("Secure first rank: " + "\nRoll No:" + l.get(position).getRollno() + "\nStudent name:"
					+ l.get(position).getSname() + "\nClass name: " + l.get(position).getClassname() + "\nTotal marks: "
					+ l.get(position).getTotalmarks());
		} else {
			System.out.println("add student data first");
		}
	}

	public void getLess50() {
		// Print name of those students who’s marks are below 50%.
		if (count > 0) {
			Iterator<Student> itr = l.iterator();

			while (itr.hasNext()) {
				Student s = itr.next();

				if (s.getTotalmarks() < 250) {
					System.out.println("----------------------------");
					System.out.println(s.getRollno());
					System.out.println(s.getSname());
					System.out.println(s.getClassname());
					System.out.println(s.getTotalmarks());
					System.out.println("-----------------------------");
				}
			}
		} else {
			System.out.println("add stu data first");
		}

	}

	public void failStudent() {
		// Print name of those students who’s marks are below 35% it means they are fail.
		if (count > 0) {
			Iterator<Student> itr = l.iterator();

			while (itr.hasNext()) {
				Student s = itr.next();

				if (s.getTotalmarks() < 175) {
					System.out.println("------------------------------");
					System.out.println(s.getRollno());
					System.out.println(s.getSname());
					System.out.println(s.getClassname());
					System.out.println(s.getTotalmarks());
					System.out.println("-------------------------------");
				}
			}
		} else {
			System.out.println("add stu data first");
		}
	}

	public void sortbymarks() {
		Collections.sort(l, new Markssort());

		for (Student s : l) {

//				System.out.println(s.getTotalmarks());
//				System.out.println(s.getRollno());
//				System.out.println(s.getSname());
//				System.out.println(s.getClassname());
			System.out.println(s);
		}

	}

	public void sortbyName() {
		Collections.sort(l, new NameSort());
		for (Student s : l) {
			System.out.println(s);
		}
	}

	public void sortByAverage() {

		int totalmark1 = 0;
		int count1 = 0;
		for (int i = 0; i < no; i++) {

			totalmark1 = totalmark1 + l.get(i).getTotalmarks();
			count1++;

		}
		int a = totalmark1 / count1;
		for (int j = 0; j < no; j++) {
			if (a <= l.get(j).getTotalmarks()) {
				System.out.println("student whoes mark greater than average: " + l.get(j).getSname() + ":"
						+ l.get(j).getTotalmarks());
			}
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student you want to add:");
		int num = sc.nextInt();

		int totalmarks = 0;

		int i = 0;

//		for(i=0;i<num;i++) {
//			list.add(new Student());
//		}

		for (i = 0; i < num; i++) {

			Student s = new Student();
			System.out.println("Enter roll number: ");
			s.setRollno(sc.nextInt());
			System.out.println("Enter student name: ");
			s.setSname(sc.next());
			System.out.println("Enter class name: ");
			s.setClassname(sc.next());
			System.out.println("Enter total marks: ");
			s.setTotalmarks(sc.nextInt());
			list.add(s);

		}

//		int position=0;
//		totalmarks=list.get(0).getTotalmarks();
//		
//		for(i=0;i<num;i++) {
//			if(totalmarks<list.get(i).getTotalmarks()) {
//				totalmarks=list.get(i).getTotalmarks();
//				position=i;
//			}
//			
//		}

		// System.out.println("Secure first rank: \nRoll No:
		// "+list.get(position).getRollno()+"\nStudent
		// name:"+list.get(position).getSname()+"\nClass name:
		// "+list.get(position).getClassname()+"\nTotal marks:
		// "+list.get(position).getTotalmarks());

		/*
		 * for (Student student : list) { System.out.println(student.toString()); }
		 */

		for (Student student : list) {

			int avg = (student.getTotalmarks() * 100 )/ 500;
			// System.out.println(avg);

			if (avg < 50) {
				System.out.println("Students below 50% :" );
				System.out.println(student.getSname()+" Per: "+ avg);
			}
			
			else if (avg > 60) {
				System.out.println("Students above 60% :");
				System.out.println(student.getSname()+" Per: "+ avg);
			}
			else {
				System.out.println("Students below 35% :" );
				System.out.println(student.getSname()+" Per: "+ avg);
			}
		}

		execute(list);
	}

	private static void execute(List<Student> list) {
        // TODO Auto-generated method stub



		StudentText sm = new StudentText();
		while (true) {
			System.out.println("=============================");
			System.out.println("Enter 1 for add Student" + "\nEnter 2 for get secure first rank"
					+ "\nEnter 3 get less than 50%" + "\nEnter 4 for get less than 35% means fail student"
					+ "\nEnter 5 for sort by mark" + "\nEnter 6 for sort by name" + "\nEnter 7 for average sort");
			System.out.println("=============================");
			Scanner sc1 = new Scanner(System.in);
			int ch = sc1.nextInt();
			switch (ch) {
			case 1:
				sm.addStudent();
				break;
			case 2:
				sm.getSecureFirst();
				break;
			case 3:
				sm.getLess50();
				break;
			case 4:
				sm.failStudent();
				break;
			case 5:
				sm.sortbymarks();
				break;
			case 6:
				sm.sortbyName();
				break;
			case 7:
				sm.sortByAverage();
				break;
			}
		}

    }


}
