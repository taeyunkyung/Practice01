package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long year = sc.nextLong();
		System.out.println("빛이 1년 동안 가는 거리는 " + (year*365*24*60*60*300000) + " km 입니다.");
		
		sc.close();
	}
}
