package Exception_Handlining.attendance;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) throws EmployeeAbscendingException, LeaveExceedLimitException {

		Scanner sc = new Scanner(System.in);
		// int salary=0;
		int present = 0;
		int leave = 0;

		char[] presentdays = new char[30];
		for (int i = 0; i < presentdays.length; i++) {
			System.out.println("Enter the attendence : " + (i + 1) + ":");
			String s = sc.next();
			presentdays[i] = s.charAt(0);
			if (i > 1) {
				if (presentdays[i - 1] == presentdays[i - 2] && presentdays[i - 2] == 'A') {
					leave++;
					throw new LeaveExceedLimitException("LEAVE EXCEEDED");

				}
			}

			if (i > 3) {
				if (presentdays[i - 1] == presentdays[i - 2] && presentdays[i - 3] == presentdays[i - 4]
						&& presentdays[i - 4] == 'N') {
					throw new EmployeeAbscendingException("ABSCONDED");
				}

			}
			if (leave > 2) {
				throw new LeaveExceedLimitException("LEAVE EXCEEDED");
			}

			if (presentdays[i] == 'P') {
				present++;
			}

		}

		sc.close();
		System.out.println("Present Day: " + present);
		System.out.println("salary: " + present * 100);
	}

}
