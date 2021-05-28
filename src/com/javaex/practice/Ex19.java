package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=0;
		while(true) {
			System.out.println("----------------------- ");
			System.out.println("1.예금|2.출금|3.잔고|4.종료 ");
			System.out.println("----------------------- ");
			System.out.print("선택>");
			int choice = sc.nextInt();
			if(choice==4) {
				System.out.print("프로그랩 종료");
				break;
			}
			else if (choice==2) {
				System.out.print("출금액>");
				int back = sc.nextInt();
				x=x-back;
			}
			else if (choice==3) {
				System.out.println("잔고액>"+x);
			}
			else if (choice==1) {
				System.out.print("예금액>");
				int save = sc.nextInt();
				x=x+save;
			}
			else {
				System.out.println("다시입력해주세요");
			}
			
			sc.close();
		}

	}

}
