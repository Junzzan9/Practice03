package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = sc.nextInt();
		int x = 0;
		int sum = 0;
		for (int y=1;y<=n;y++) {
			if(y%5==0) {
				x=x+1;
				sum=sum+y;
			}
		}
		System.out.println("5의배수의 개수: "+x);
		System.out.println("5의배수의 합: "+sum);
		
		sc.close();

	}

}
