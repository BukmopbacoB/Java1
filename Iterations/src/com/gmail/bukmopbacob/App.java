package com.gmail.bukmopbacob;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		
		metka:
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 4) continue;
				if (j == 5) break metka;
//				if (j == 5) goto metka; // c, c++, c#
				
				System.out.printf("%d", i*j);

			}
			System.out.println();
		}
		
		System.out.println("\nContinue");
		int a = 2;
		while (a < 1000) {
			System.out.println(a);
			a *= 2;
		}
		
//		a = 2;
		do {
			System.out.println(a);
//			a *= 2;
		} while ((a *= 2) < 1000);
		
		
		// 1 2 3 5 8 13 21 Фибоначи
		int a1 = 1, a2 = 2;
		System.out.println(a1);
		while (a2 < 1000) {
			System.out.println(a2);
			a2 += a1;
			a1 = a2 - a1;
		}
		
	}
}
