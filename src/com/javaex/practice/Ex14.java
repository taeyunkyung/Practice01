package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요:");
		double length = sc.nextDouble();
		System.out.print("세로를 입력하세요:");
		double width = sc.nextDouble();
		
		System.out.println("사각형의 넓이는 "+ (length*width));
		System.out.println("사격형의 둘레는 "+ (2*length+2*width));
		
		sc.close();
	}
}
