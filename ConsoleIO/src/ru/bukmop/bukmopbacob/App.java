package ru.bukmop.bukmopbacob;

import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

class Борщ {
	
}


public class App {

	public static void main(String[] args) throws IOException {
//		Борщ борщ = new Борщ();
		var борщ = new Борщ();
		var s = "abc"; // String s = "abc";
//		var q; // так нельзя
		var ch = ' ';
		
		
//		Locale.setDefault(Locale.US);
		Locale.setDefault(Locale.forLanguageTag("ru"));
//		BufferedReader reader =
//		new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.print("Name: ");
//		String userName = reader.readLine();
//		
//		System.out.print("Age: ");
//		int age = Integer.parseInt(reader.readLine());
		
		
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Name: ");
//		String userName = scanner.nextLine();
//		int age = scanner.nextInt();
//		
//		
//		
//		
////		String nameString = "Sergey";
////		int age = 45;
//		
////		System.out.printf("",);
//		String string = String.format("Privet, %-10s - %d", userName, age);
		
		System.out.print("Temperature C: ");
		double c = scanner.nextDouble();
//		c = (100-32)*(5/9);
		System.out.printf(Locale.US, "Temperature F: %.4f\n", (c * (9.0f / 5) + 32));
		
		System.out.print("Temperature F: ");
		c = scanner.nextDouble();
//		c = (100-32)*(5/9);
		System.out.printf("Temperature C: %.4f\n", ((c-32)*(5.0f/9)));

	}

}
