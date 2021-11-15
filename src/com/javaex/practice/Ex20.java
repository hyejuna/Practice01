package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int fh = sc.nextInt()*500;
		
		System.out.print("100원 개수: ");
		int h = sc.nextInt()*100;
		
		System.out.print("50원 개수: ");
		int ft = sc.nextInt()*50;
		
		System.out.print("10원 개수: ");
		int t = sc.nextInt()*10;

		System.out.println("동전의 총합은 "+(fh+h+ft+t)+" 원 입니다.");
		sc.close();
	}
}

