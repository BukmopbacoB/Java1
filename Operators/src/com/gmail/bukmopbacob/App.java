package com.gmail.bukmopbacob;

public class App {

	public static void main(String[] args) {
		int n = 10;
		
		if (n > 0) {
			System.out.println("n > 0");
		}
		
		int a = 0;
		String s = (a == 0) ? "zero" : "not zero";
		System.out.println(a);

		String name = null;
//		System.out.println(name.toUpperCase()); // NPE - java.lang.NullPointerExceptio
		System.out.println( (name != null) ? name.toUpperCase() : "<no name>");
		
		// before Java 12
		switch (a) {
		case 0:
			System.out.println(a);
			break;
		case 1:
			System.out.println(a);
			break;
		default:
			System.out.println(a);
		}
		
		// after Java 12
		switch (a) {
		case -1, 0:
			System.out.println(a);
			break;
		case 1:
			System.out.println(a);
			break;
		default:
			System.out.println(a);
		}
		
		// Java 12
		String r = switch (a) {
			case -1, 1 -> "один";
			case 2 -> "два";
			case 3 -> "три";
			default -> "много";
		};
		
		
		
		
	}

}
