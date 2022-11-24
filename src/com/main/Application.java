package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("a degerini giriniz");
			int a = scan.nextInt();
			System.out.println("b degerini giriniz");
			int b = scan.nextInt();
			int temp=0;
			
//		for (int i = a; i <= b; i++) {
//			for (int j = 0; j < b; j++) {
//				if(j*j==i) {
//					temp++;
//				}
//			}
//		}
//		System.out.println(temp);
			
			int kok = (int) Math.sqrt(a);
			if (kok*kok<a) kok++;
			while (kok*kok<=b) {
				temp++;
				kok++;
			}
			
			System.out.println(temp);
		}
	}

}
