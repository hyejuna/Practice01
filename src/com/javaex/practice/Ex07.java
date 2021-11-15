package com.javaex.practice;

public class Ex07 {
	public static void main(String[]args) {
		
		// i=10+1=11 n=11%2=1 , 06번은 나머지 계산하고 저장 후 i에 +1, 07은 +1 후 나머지 계산 후 저장
		
		int i=10;
		int n=++i %2;
		
		System.out.println(i);
		System.out.println(n);
	}

}
