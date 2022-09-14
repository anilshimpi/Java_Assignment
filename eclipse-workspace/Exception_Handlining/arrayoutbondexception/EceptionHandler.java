package Exception_Handlining.arrayoutbondexception;

import java.util.Scanner;

public class EceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 3, 2, 6, 4, 9};
        Parent p1 = new Parent();
        
        Child c1 = new Child();
        System.out.println("Choice 1 : Find maximum in array");
        System.out.println("Choice 2 : Find average and maximum of the array ");
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        switch(input) {
        case 1 :
            c1.CalculateMaxFromArray(arr1);
            break;
        case 2 :
            c1.CalculateMaxFromArray(arr1);
            break;
        }

	}

}
