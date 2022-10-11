package org.inheritances;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
  Scanner a= new Scanner(System.in);
        
	Scanner a1= new Scanner (System.in);
	System.out.println("Enter your Department ");
	           String Department  =a.nextLine();
	 
        		System.out.println("Enter your employee ID:");
        		long id= a.nextLong();
        		
        		System.out.println("Enter your name: ");
 	           String name  =a1.nextLine();
	
             	System.out.println("Enter your phone no");
                long  phno=a.nextLong()   ;
   
             	System.out.println("Enter your email Address:");
             	String email =a.next();
        	
        	
        	    System.out.println("Employee Salary :");
              	float salary =a.nextFloat();
        	
             	System.out.println("Employee Account Details  :");
        	    String Account =a1.nextLine();
        	
        	    
        		System.out.println("they above information are true or false ");
        	 
        	 boolean result = a. nextBoolean();
        	         
        	
        		System.out.println("Employee description");
        		System.out.println("======================");
        		
        		System.out.println("Enter your employee ID:" +id);
        		System.out.println("Enter your name:" +name);
        		System.out.println("Enter your email Address:" +email);
        		System.out.println("Employee Salary :" + salary);
        		System.out.println("Employee Account Details  :" +Account);
        		System.out.println("Enter your phone No :" + phno);
                System.out.println("they above information are true or false");
        		
        	        
        	        
        		
        		
        		
        		
	}

}
