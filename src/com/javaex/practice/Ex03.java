package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2; 
		int b = y++ *2; // 1번(y++) 2번 (1번*2) --> 2*2=4
		
		System.out.println("a=" +a); // x를 1 올리고 출력한 값인 a, a*2 --> 2*2=4
		System.out.println("b=" +b); // y를 출력한 값인 b(y를 1올림), b*2 --> 1*2=2
		System.out.println("x=" +x); // ++x 값 --> 2
		System.out.println("y=" +y); // y++ 값 --> 2
		
	}
}
