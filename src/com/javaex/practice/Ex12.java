package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int sum = 1;
		for(int i=n;i>1;i--) {
			sum=sum*i;
		}
		System.out.println("결과값:"+sum);
		sc.close();
	}

}
