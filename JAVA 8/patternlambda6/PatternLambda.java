package com.yash.java8.patternlambda6;

import java.util.Scanner;

public class PatternLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number of row needed to in the pattern");
        int row=sc.nextInt();
        
        Pattern p= (r)->{System.out.println("Print pattern: "+(r));





      int alphabet=65;
        for(int i=0;i<=row;i++) {
            
            for(int j=0;j<=row-i;j++) {
                System.out.print((char)(alphabet+j));
            }
            
            for(int k=1;k<=i*2-1;k++) {
                System.out.print(" ");
            }
            
            for(int l=row-i;l>=0;l--) {
                
                if(l!=row)
                    System.out.print((char)(alphabet+l));
            }
            System.out.println();
        }
        
        };    
        p.displayPattern(row);    
	}

}
