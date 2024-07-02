package hk.edu20240702.day04;

import java.util.Iterator;

public class D1_StarView {
	
	public static void main(String[] args) {
		
		// 등차수열 = a1 + (n-1)*d -> 자바에서는 1이 아니라 0으로 시작하기 때문에 -1을 해줄 필요가 없음
		
		/*
		   0*   0 + 1(별의개수) a1 + (n-1)*d
		   1**  1 + 1         1 + (0)  * 1
		   2*** 2 + 1         1 + (1) * 1 인덱스에 따라 1씩 증가 
		   3****
		   4*****
		   5******
	
		 */
		
	/*	for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 1 + i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 내부 루프가 끝날 때마다 줄바꿈
		} */
		
		
		/* 정삼각형
		  ☆☆☆☆★
		/* 3.정삼각형
		  ☆☆☆☆★                    4+i*-1 = 4-i  공백을 구하는 일반항 
		  ☆☆☆★★★
		  ☆☆★★★★★
		  ☆☆★★★★★                  1+i*2   별을 출력하는 일반항
		  ☆★★★★★★★
		  ★★★★★★★★★
		 */
		
		int num = 10;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-1-i; j++) {
				System.out.print("☆");
			}
			for (int j = 0; j < 1+i*2; j++) {
				System.out.print("★");
			}
			System.out.println();
		} 
		
		
		System.out.println("=================================");
		/*  4.아래방향 정삼각형
	  0	★★★★★★★★★9    공백출력 : 0 1 2 3 4                    0 + i * 1 = i 
	  1	☆★★★★★★★7       별출력 : 9 7 5 3 1                    9 + i * (- 2) = 9 - ( i * 2)
	  2	☆☆★★★★★ 5
	  3	☆☆☆★★★3
	  4	☆☆☆☆★1
	 */
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				
				System.out.printf("☆");
				
				
			}
			for (int j = 0;  j < 9 - (i * 2); j++) {
				
				System.out.print("★");
				
			}
			
			System.out.println();
		}
		
		System.out.println("=================================");
		//위쪽방향 정삼각형
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-1-i; j++) {
				System.out.print("☆");
			}
			for (int j = 0; j < 1+i*2; j++) {
				System.out.print("★");
			}
			System.out.println();
		} 
		
		//아래쪽방향 정삼각형
		for (int i = 0; i < num - 1; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("☆"); 
				}
			for(int j = 0; j < ((num-1)*2-1) - (i *2); j++) {
				System.out.print("★");
			}
				
				
				
			
			System.out.println();
			
			
			
			
		}
		
	}

}
