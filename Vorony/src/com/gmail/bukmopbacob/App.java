package com.gmail.bukmopbacob;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		
		String voronyString = "Сколько ворон на ветке?";
		System.out.println(voronyString);
		int t = scanner.nextInt();
		n = t % 100;
		if (n > 19 || n < 10) {
			n = n % 10;
		} else {
			n = 0;
		}
		
//		switch (n) {
//			case 0:
//			case 5:
//			case 6:
//			case 7:
//			case 8:
//			case 9:
//				voronyString = "ворон";
//				break;
//			case 1:
//				voronyString = "ворона";
//				break;
//			case 2:
//			case 3:
//			case 4:
//				voronyString = "вороны";
//				break;
//		default:
//			
//			break;
//		}
	voronyString = switch (n) {
		case 1 -> "ворона";
		case 2, 3, 4 -> "вороны";
		default -> "ворон";
	};
		
		
		System.out.printf("На ветке %d %s", t, voronyString);

	}

}
