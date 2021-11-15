package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2; // i를 1 올리고 출력한 값인 n, n%2
		
		System.out.println(i); // i를 1 올림 --> 11
		System.out.println(n); // n%2 --> 11%2=1
	}
}
