package curriculum.b;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		
		//Q1
		int[] scores = new int[5];										//int 型の配列 を作成
		int[] scoress = {1, 2, 3, 4, 5};								//1, 2, 3, 4, 5 を格納
		System.out.println(Arrays.toString(scoress));					//配列の全要素を 順番に表示
		
		
		//Q2
		int[] scores2 = {10, 20, 30, 40, 50};							//int 型の配列 {10, 20, 30, 40, 50} を用意
		
		for (int s = scores.length;  s>0;) {
			s--;														//配列の要素を 逆順 に表示
			System.out.println(scores2[s]);
		}
		
		
		//Q3
		int[] scores3 = {3, 5, 7, 9, 11};								//int 型の配列 {3, 5, 7, 9, 11} を用意
		int sum3=0;
		for (int s3 =0; s3< scores3.length; s3++) {						//配列の全要素の 合計値 を計算し、表示
			sum3 += scores3[s3];
		}
		System.out.println(sum3);
		
		
		//Q4
		int[] scores4 = new int [6];									//int 型の配列 {12, 7, 9, 21, 5, 18} を用意
		int[] scoress4 = {12, 7, 9, 21, 5, 18};
		
		int maximum =scoress4[0];
		int minimum =scoress4[0];
		for(int s4 =1; s4<scoress4.length; s4++) {
			if (scoress4[s4]> maximum) {								//配列の最大値を求めて表示
				maximum = scoress4[s4];
			}
			if (scoress4[s4]< minimum) {								//配列の最小値を求めて表示
				minimum = scoress4[s4];
			}
		}
		System.out.println("最大値" + maximum);
		System.out.println("最小値" + minimum);
		
		
		//Q5
		for (int scoress5 =0; scoress5 < scoress.length; scoress5++) {
			scoress[scoress5] *= 2;										//配列のすべての要素を 2 倍 
		}
		
		for (int s5 : scoress) {
			System.out.println(s5);										//結果を表示
		}
		
		
		//Q6
		int[] scoress6 = {4, 7, 10, 15, 20};							// int 型の配列 {4, 7, 10, 15, 20} を用意
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();									//ユーザーがコンソール入力
		boolean found = false;
		
		for(int s6 :scoress6) {											//入力した数が 配列に含まれているか を判定
			if(s6 == input) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(input + "は配列に含まれています");		//結果を表示”入力した値”は配列に含まれています

		} else { 
			System.out.println (input+ "は配列に含まれていません");		//結果を表示" 入力した値”は配列に含まれていません

		}
		
		
		
		//Q7
		int[][] array = {
				{1, 2},
				{3, 4},
				{5, 6}
		};																//2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意
		for (int i7 =0; i7 < array.length; i7++) {
			for(int j7 =0; j7 < array[i7].length; j7++) {
				System.out.print(array[i7][j7] +" ");					//配列の すべての要素を表示
			}
			System.out.println();
		}
		
		
		//Q8
		int[][] array8 = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};																//2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意
		int sum8 =0;
		for (int i8 =0; i8 <array8.length; i8++) {
			for (int j8 =0; j8 <array8.length; j8++) {
				sum8 += array8[i8][j8];									//配列の すべての要素の合計を計算
			}
		}
		System.out.println("合計値" + sum8);							//結果を表示
		
		
		//Q9
		int [][] array9 = {
				{12, 15, 8},
				{6, 19, 25},
				{30, 2, 10}
		};																//2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意
		int max9 = array9[0][0];
		int min9 = array9[0][0];
		for (int s9 =1; s9 < array9.length; s9++) {
			for(int t9 =0; t9 < array9.length; t9++) {
				if (array9[s9][t9]> max9) {								//配列の最大値を求めて表示
					max9 = array9[s9][t9];
				}
				if (array9[s9][t9]< min9) {								//配列の最小値を求めて表示
					min9 = array9[s9][t9];
				}
			}
		}
		System.out.println("最大値" + max9);
		System.out.println("最小値" + min9);							//配列内の最大値と最小値を表示
		
		
		
		//Q10
		int[][][] array10 = {
			{
				{1, 2},
				{3, 4}
			},
			{
				{5, 6},
				{7, 8}
			}
		};																// 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意
		for(int i10 =0; i10< array10.length; i10++) {
			for(int j10 =0; j10 <array10[i10].length; j10++) {
				for(int k10= 0; k10 <array10[i10][j10].length; k10++) {
					System.out.print(array10[i10][j10][k10] + " ");		//配列内のすべての要素を 表示
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
	}

}
