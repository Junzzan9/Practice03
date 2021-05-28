package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int sum=0;
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("합계:"+sum);

		sc.close();
	}

}
