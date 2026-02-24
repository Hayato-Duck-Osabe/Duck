package curriculum.b;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		
		//Q1
		for (int i =1; i<=10; i++) {									//for 文を使って 1 から 10 までの数字を 1 つずつ表示
			System.out.println(i);
		}
		
		
		//Q2
		for (int o =2; o<=20; o += 2) {									//for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
			System.out.println(o);
		}
		
	
		//Q3
		for (int d =10; d>=1; d--) {									//for 文を使って 10 から 1 まで カウントダウンして表示
			System.out.println(d);
		}
		
		
		//Q4
		int sum =0;
		for (int s =1; s<=100; s++) {									//for 文を使って 1 から 100 までの合計 を表示	
			sum +=s;
			System.out.println(sum);
		}
		
		
		//Q5
		String star =" ";
		for (int str =0; str<=5; str++ ) {								// 1 から 10 まで を 1 つずつ表示
			star +="*";
			System.out.println(star);
		}
		
		
		//Q6
		int count = 1;
		while (count <=10) {											// 2 から 20 までの偶数 を 1 つずつ表示
			System.out.println(count);
			count++;
		}
		
		
		//Q7
		int dcount =2;
		while (dcount <=20) {											// 10 から 1 まで のカウントダウンを表示
			System.out.println(dcount);
			dcount+= 2;
		}
		
		
		//Q8
		int countdown =10;
		while (countdown >=1) {											// 1 から 100 までの合計 を表示
			System.out.println(countdown);
			countdown--;
		}
		
		
		//Q9
		int sumw =0;
		int sumwhile =1;
		while (sumwhile<=100) {
			sumw += sumwhile;											//1から100まで実行
			sumwhile++;													//合計を表示
			System.out.println(sumw);
		}
		
		
		//Q10
		Scanner scanner = new Scanner(System.in);						//数値をコンソール入力
		int forinp=1;
		while (forinp !=0) {											//forinpが0以外とする
			forinp = scanner.nextInt();									//0が入力されたら「終了しました」と表示
		}
		System.out.println("終了しました");
		
		
		//Q11
		for (int kukuY =1; kukuY <=9; kukuY++) {						//for文を使用して九九表を出力
			for (int kukuT =1; kukuT <=9; kukuT++) {					//kukuT　と　kukuYで段と行を作成
				System.out.printf("|| %02d*%02d=%02d ", kukuY, kukuT,kukuY * kukuT);
			}															//表に段と行を分けるように出力
			System.out.println();
		}
		
	
	
	

	}

}
