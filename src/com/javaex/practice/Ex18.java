package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = sc.nextInt();
		
		for(int a=1;a<=n;a++) {
			for(int b=n;b>=a;b--) {
				System.out.print("*");
			}
			System.out.println("");
			}
		for (int a=1;a<=n;a++) {
			for(int b=0;b<=a-1;b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}

}
