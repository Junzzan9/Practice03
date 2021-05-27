package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		
		for (int a=1;a<=n;a++) {
			for(int b=0;b<a;b++) {
				System.out.print(a);
			}
			System.out.println("");
		}
		sc.close();

	}

}
