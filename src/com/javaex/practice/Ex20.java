package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("   [숫자 맞추기 게임]   ");
		System.out.println("====================");
		int n = 77;
		String exit = new String("y");
		while (true) {
			System.out.print(">>");
			int a = sc.nextInt();
			if(a==n) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n)");
				
				String q = sc.nextLine();
				
				
				if(q.equals(exit)){
					System.out.println("====================");
					System.out.println("   [숫자 맞추기 종료]   ");
					System.out.println("====================");
					break;
				}
				else {
					System.out.println("재시작");
				}
			}
			else if (a>n) {
				System.out.println("더 낮게");
			}
			else {
				System.out.println("더 높게");
			}
		}
		sc.close();
	}

}
