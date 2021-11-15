package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		double f = 80.0;
		System.out.println((f-32.0)*5/9); 
		// 5/9 * (f-32)의 계산 순서에서 1번인 5/9는 0이므로 0*(f-32)=0
		// (f-32)*5/9로 순서를 바꾸면: 1번 f-32=48, 2번 48*5=240, 3번 240/9 이므로 0이 발생하지 않음
		
	}
}
