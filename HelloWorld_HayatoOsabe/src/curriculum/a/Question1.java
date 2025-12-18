package curriculum.a;


//Java基礎問題１の課題

public class Question1 {

	public static void main(String[] args) {
		// Q1
		byte byteNum = 1;  					// byte型の変数 初期値を設定
		short shortNum = 1;					// short型の変数 初期値を設定
		int intNum = 1;						// int型の変数 初期値を設定
		long longNum = 1;					// long型の変数 初期値を設定
		float floatNum = 1.4f;				// float型の変数 初期値を設定
		double doubleNum = 2.236;			// double型の変数 初期値を設定
		char letter = 'H';					// char型の変数 初期値を設定
		String letters = "Duck";			// String型の変数 初期値を設定
		boolean isBoolean = false;			// boolean型の変数 初期値を設定
		
		
		
		//Q2
		byteNum = 10;						// 変数byteNumに10を代入
		shortNum = 100;						// 変数shortNumに100を代入
		intNum = 1000;						// 変数intNumに1000を代入
		longNum = 10000;					// 変数longNumに10000を代入
		floatNum = 9.5f;					// 変数floatNumに9.5fを代入
		doubleNum = 10.5;					// 変数doubleNumに10.5を代入
		letter = 'a';						// 変数letterに"a"を代入
		letters = "ハロー";					// 変数lettersに"ハロー"を代入
		isBoolean = true;					// 変数isBooleanにtrueを代入
		
		
		
		//Q3
		System.out.println(byteNum + shortNum + intNum + longNum);			// 11110を出力
		System.out.println(byteNum * 2); 								    // 20を出力
		System.out.println(letter + letters + isBoolean);					// a ハロー trueを出力
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum); // 数字を全部足して出力
		System.out.println(byteNum * shortNum * intNum * longNum);			// 小数点以外䛾数字を全䛶かけ䛶出力
		System.out.println(doubleNum / shortNum);							// 10.5割る100をして出力
		System.out.println(byteNum - shortNum);								// 10引く100をして出力
		
		
		
		//Q4
		String name = "山田太郎";											//nameいう String型の変数を宣言し、その変数に "山田太郎"という値を代入してください。
		System.out.println("こんにちは" + name + "さん！");					//name変数を使用してコンソールに　こんにちは、山田太郎さん！ と表示してください。
		
		
		//Q5
		int age = 25;														// int型の変数 age を宣言し、その変数に 25 を代入してください
		System.out.println("年齢：" + age + "歳");									// age変数を使用して、コンソールに「年齢: 25歳」と表示してください
		
		
		
		//Q6
		int num1 = 10;														// int型の変数 num1 を宣言して 10 を代入
		int num2 = 5;														// int型の変数 num2 を宣言して 5 を代入
		int sum = num1 + num2;												
		System.out.println(sum);											// num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示
		
		
		//Q7
		int score = 80;														// int型の変数 score を宣言して 80 を代入
		score = score + 20;													// score に 20 を加えて値を更新
		System.out.println("最終スコア:" + score);							// score を使用して「最終スコア: 100」をコンソールに表示
		
		
		//Q8
		double price = 99.99;												// double型の変数 price を宣言して 99.99 を代入
		int seisuprice = (int) price;										
		System.out.println("整数価格" + seisuprice);						// price を int型に変換し、整数価格: 99 をコンソールに表示
		
		
		//Q9
		
		String numStr = "123";												// String型の変数 numStr に "123" を代入
		int numS = Integer.parseInt(numStr);								
		System.out.println("変換後の値: " + (numS + 10));					// numStr を int型に変換し、変換後の値に 10 を加えた結果を「変換後の値: 」の後ろに付けてコンソールに表示
		
		
		//Q10
		int num = 50;														// int型変数 numに50を代入
		String numT = String.valueOf(num);
		System.out.println("得点：" + numT + "点");							// int型の変数 num を String 型に変換し、「得点: 50点」という形でコンソールに表示
		
		
		//Q11
		int a = 10;															// int型の変数 a に 10 を代入
		int b = 20;															// int型の変数 b に 20 を代入
		boolean result = (a < b);											// 条件演算子を使用して、a が b より小さいかどうかを判定
		System.out.println(result);											// その結果を boolean 型の変数 result に代入
		
		
		//Q12
		int x = 15;															// int 型䛾変数 x 䛻 15 を代入
		String max = (x >= 10 ) ? "OK" : "NG" ;								// x が 10 以上䛺ら "OK"、そう䛷䛺けれ䜀 "NG" を表示
		System.out.println(max);
		
		
		//Q13
		String text = "私はJavaが好きです。　Javaは楽しい！";				// String型の変数 text に「私はJavaが好きです。Javaは楽しい！」という文章を代入
		text = text.replace("Java", "Python");								
		System.out.println(text);											// 文章の中にある「Java」を「Python」に置き換えて表示
		
		
		
		
	}

}
