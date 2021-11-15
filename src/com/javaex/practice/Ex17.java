package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름:");
		double r = sc.nextDouble();
		final double PI = 3.14;
		System.out.println("구의 부피는: "+(PI*r*r*r*4.0/3.0));
		
		sc.close();
	}
}
