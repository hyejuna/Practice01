package com.javaex.practice;

public class Ex09 {
	
	public static void main(String[]args) {
		
		double f=80.0;
		System.out.println(5/9*(f-32.0));
		// 5/9는 정수 몫만 구해서 0, 0에는 뭘 곱해도 0
		System.out.println((double)5/9*(f-32.0));
	}

}
