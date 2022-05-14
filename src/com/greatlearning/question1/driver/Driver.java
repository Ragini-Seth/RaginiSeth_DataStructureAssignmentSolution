package com.greatlearning.question1.driver;

import java.io.IOException;
import java.util.Scanner;

import com.greatlearning.question1.service.Service;

class Driver {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {

		System.out.println("enter the total no of floors in the building");
		
		int noOfFloor = sc.nextInt();

	    int[] floors = new int[noOfFloor];
		
	   
		for(int i=0; i<noOfFloor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		Service service = new Service();
		service.printConstructionFloors(floors, noOfFloor);
	}
}