package chap5;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
  *  
 *** 
*****

바닥*갯수 : 높이*2-1
 */

public class Test6 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int bottom = len * 2 - 1;
		int m = bottom / 2; //2
		System.out.println("1.==========");
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < bottom; j++) {
				if (j >= m - i && j <= m + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("2.==========");
		for(int i=1;i<=len;i++) {
			for(int j=1;j<=len-i;j++) { //3-3 : 세번째 줄 공백 0
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {// 2*3-1:세번째 줄 *****
				System.out.print("*");
			}
			System.out.println();
		}

	}
}