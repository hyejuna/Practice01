package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("화씨: ");
		
		double f = sc.nextDouble();
		
		System.out.println("화씨 "+f+"의 섭씨 온도는 "+((double)5/9*(f-32))+" 입니다.");
		
		sc.close();
	}

}
