package pro;

import java.util.Scanner;

public class StudentIdCard {

	public static void main(String[] args) {
		String name;
		String bloodGroup;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = scanner.nextLine();

		System.out.println("Enter age: ");
		age = scanner.nextInt();

		System.out.println("Enter blood group: ");
		bloodGroup = scanner.next();
		System.out.println("--------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Blood Group: " + bloodGroup);
		System.out.println("--------------------------------");
		if (age >= 20) {
			System.out.println("Your group is RED");
		} else if (age >= 15 && age < 20) {
			System.out.println("Your group is BLUE");
		} else if (age >= 10 && age < 15) {
			System.out.println("Your group is YELLOW");
		}
		System.out.println("--------------------------------");
	}
}
