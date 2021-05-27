package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = sc.nextInt();
		int c = n%2;
		int sum=0;
		for (int x=1;x<=n;x++) {
			if(c==0&&x%2==0) {
				sum=sum+x;
			}
			else if (c==1&&x%2==1) {
				sum=sum+x;
			}
		}
		System.out.println("결과값: "+sum);
		sc.close();
		
	}
}
