package curriculum.b;

import java.util.Scanner;

//Java基礎問題２
public class Question2 {

	public static void main(String[] args) {

		//Q1
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		} // int の変数 scoreを宣言して75を代入,scoreが60 以上の場合は「合格です！」と表示

		//Q2
		int age = 25;
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です"); // int 型の変数 age を宣言して25を代入する。ageが20以上かつ30以下の場合は適正年齢です」と表示
		} else {
			System.out.println("対象外です");
		}

		//Q3
		age = 18;								// int 型の変数 age に 18 を代入
		if (age >= 20) {
			System.out.println("成人です");		// age が 20 以上の場合 は「成人です」と表示
		}
		else if (age >= 13 && age <= 19) {			// age が 13 以上かつ 19 以下の場合なら「ティーンエージャーです」と表示
			System.out.println("ティーンエージャーです");
		}
		else if (age <= 12) {						// age が 12 以下の場合　「子供です」と表示
			System.out.println("子供です");
		}
		
		
		
		//Q4
		int x = 30;								// int 型の変数 x、y、z にそれぞれ 30、15、50 を代入
		int y = 15;
		int z = 50;
		if (x>y && x>z) {						// 3つの数値の中で 最も大きい値を判定して表示
			System.out.println("一番大きい数字は"+ x +"です");
		}
		else if (y>x && y>z) {
			System.out.println("一番大きい数字は"+ y +"です");
		}
		else if (z>x && z>y) {
			System.out.println("一番大きい数字は"+ z +"です");
		}
		
		
		//Q5
		Scanner scanner = new Scanner(System.in);							//int 型の変数 num を用意し、コンソール入力 によって値を代入 
		int num = scanner.nextInt();
		if (num > 0) {														//num の値が 0 より大きい場合 は「正の数です」と表示
			System.out.println("正の数です");
		}
		else if (num == 0) {														//num の値が 0 の場合 は「0 です」と表示
			System.out.println("0です");
		}
		else if (num < 0) {														//num の値が 0 より小さい場合 は「負の数です」と表示
			System.out.println("負の数です");
		}
		
		
		//Q6							
		int value = scanner.nextInt();										//int 型の変数 value を用意し、コンソール入力 によって値を代入
		if (value %2 ==0 ) {												//value が偶数の場合 は「偶数です」と表示
			System.out.println("偶数です");
		}
		else System.out.println("奇数です");								//value が奇数の場合 は「奇数です」と表示
		
		
		//Q7
		int score1 = scanner.nextInt();										//int 型の変数scoreにコンソール入力で0から100のいずれかの数値を代入
		if (score1 >= 90) {													//90以上なら”優”
			System.out.println("優");
		}
		else if (score1 >= 70 && score1 <90) {									//70以上なら”良”
			System.out.println("良");
		}
		else if (score1 >=50 && score1< 70) {									//50以上なら”可”
			System.out.println("可");
		}
		else if (score1 <50) {													//50未満なら”不可”を表示
			System.out.println("不可");
		}
		
		
		//Q8
		scanner.nextLine();
		String word = scanner.nextLine();									
		if (word == null || word.isEmpty()) {								//コンソール入力が nullまたは（""の場合に「入力が無効です」と表示
			System.out.println("入力が無効です");
		}
		
		
		
		//Q9
		int day = scanner.nextInt();										//int 型の変数 day を用意するし、コンソール入力で 1〜7 の数値を代入
		switch (day) {
		case 1: 
			System.out.println("月曜日");									//数値に応じて曜日を表示
			break;
		case 2: 
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");							//1〜7 以外なら「無効な入力です」と表示
		}
			
			
			
		//Q10
		int month = scanner.nextInt();										//int 型の変数 month を用意し、コンソール入力で 1～12 の数値を代入
		switch (month) {													//月の値に応じて 季節 を表示
		case 12,1,2:
			System.out.println("冬");
		break;
		case 3,4,5:
			System.out.println("春");
		break;
		case 6,7,8:
			System.out.println("夏");
		break;
		case 9,10,11:
			System.out.println("秋");
		break;
		default:															//それ以外は「無効な月です」と表示
			System.out.println("無効な月です");		
		}
		scanner.close();	
			
		

	}
}
