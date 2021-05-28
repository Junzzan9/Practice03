package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int sum=0;
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			if(i==n) {
				System.out.print(i);
			}
			else {
				System.out.print(i+"+");
			}
			
		}
		System.out.println("");
		System.out.println("결과는: "+sum);

		sc.close();
	}

}
