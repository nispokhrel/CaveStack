package tunnels;

import java.util.*;

/**
 * Name: Nishant Pokhrel 
 * Date: October 24, 2021 
 * Subject: CS 216- Data Structures & Algorithms 
 * Assignemt: chapter06 Purpose: This program prompts user for
 * various names and GPS coordinates and demonstrate add, remove and list
 * implementations for the cave.
 * 
 * @author Npokhrel
 */
public class CaveStackDemo {

	public static void main(String[] args) {
		// CaveList=cListing
		// listCave=cList
		String cName; // stores name of the cave
		String cLatitude; // stores the latitude of the cave
		String cLongitude; // stores the longitude of the cave
		String aAdd; // stores the response for adding cave
		String aRemove; // stores the response for removing cave
		String aList; // stores the response for list or not

		Scanner input = new Scanner(System.in); // using scanner to record input

		CaveStack<Cave> cListing = new CaveStack<Cave>();
		boolean check = true; // oversee the conditions to be implemented
		while (check) {
			System.out.print("Enter the name of the cave you want to add" + " to the cave system: ");
			cName = input.next();

			System.out.print("Enter the latitude of the cave: ");
			cLatitude = input.next();

			System.out.print("Enter the longitude of the cave: ");
			cLongitude = input.next();

			Cave cave = new Cave(cName, cLongitude, cLatitude);
			cAdd(cListing, cave);

			System.out.println("*******************************************************");
			System.out.println(" ");
			System.out.print("Do you want to add another cave? " + "\nEnter Yes or No: ");
			aAdd = input.next();
			System.out.println(" ");

			if (!aAdd.equalsIgnoreCase("Yes")) {
				check = false;
				System.out.println("*******************************************************");
				boolean move = true;
				while (move) {
					System.out.print("Do you want to remove cave from the cave system? " + "\nEnter Yes or No: ");
					aRemove = input.next();
					System.out.println(" ");
					if (aRemove.equalsIgnoreCase("Yes")) {
						cRemove(cListing, cave);
						System.out.println("*******************************************************");
						System.out.println(" ");

					} else {
						move = false;

					}

				}

			}

		}

		System.out.println("*******************************************************************");
		System.out.println(" ");
		System.out.print("Do you want to list the caves in the cave system?" + "\nEnter Yes or No: ");
		aList = input.next();
		if (aList.equalsIgnoreCase("Yes")) {
			System.out.println(" ");
			cList(cListing);
		}
		input.close(); // closing the scanner object

	}

	// Adding items to the stack
	public static void cAdd(CaveStack cListing, Cave cave) {
		boolean check;
		check = cListing.push(cave, cave.getGPS());

		if (check) {
			System.out.println(cave.getName() + " is added to the cave system.");
		} else {
			System.out.println(cave.getName() + " is a duplicate entry.\nTry Again!!");
		}
	}

	// Removing items from the stack
	public static void cRemove(CaveStack cListing, Cave cave) {
		if (cListing.isEmpty()) {
			System.out.println("You do not have any cave info to delete.");
		} else {
			cListing.pop();
			System.out.println("The last entry of the cave system was successfully removed.");
			System.out.println(" ");

		}
	}

	// Showing the list of items in the stack
	public static void cList(CaveStack cListing) {
		if (cListing.isEmpty()) {
			System.out.println("Nothing to display.The cave system is empty.");
		}
		while (!cListing.isEmpty()) {
			Cave caves = (Cave) cListing.pop();
			System.out.println("Name: " + caves.getName());
			System.out.println("Latitide: " + caves.getLatitude());
			System.out.println("Longitude: " + caves.getLongitude());
			System.out.println("------------------------------------");
			System.out.println(" ");
		}

	}

}