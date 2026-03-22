package springBoot.com;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter You Name:");
		String name = sa.next();
		System.out.println("Name is:" + name);
		for (int i = 0; i <= 10; i++) {

			System.out.println("i" + i);
		}
		System.out.println("This is new change");
	}
}
