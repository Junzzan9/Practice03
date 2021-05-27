package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		
		/*출력 예상 index= 0            order= 0
		 *        index= 1            order= 1
		 *        index= 2            order= 2
		 */

		System.out.println("while문");
		int index = 0;
		while (index<3) {
			System.out.println("index= "+index);
			index++;
		}
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order= "+order);
		}
	}

}
