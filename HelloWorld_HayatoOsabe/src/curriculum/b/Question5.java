package curriculum.b;

public class Question5 {

	
	//Q1
	public static void helloWorld() {							//メソッドの作製
		System.out.println("Hello, World!");					//Hello, World！の表示
	}
	

	//Q2
	public static int doubleValue(int num) {					//メソッドの作製
		return num * 2;											//戻り値2倍
	}
	
	//Q3
	public static boolean isEven(int num) {						//メソッドの作製
		return num % 2 ==0;										//偶数奇数判断
	}

	
	
	
	public static void main (String[] arg) {
		helloWorld();											//Q1 表示用
		
		int result=doubleValue(10);
		System.out.println(result);								//Q2表示用
		
		
		int num1 = 10;											//Q3表示用
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です");	
		}else {
			System.out.println(num1 + "は奇数です");
		}
		int num2 = 7;
		if(isEven(num2)) {
			System.out.println(num2 + "は偶数です");
		}else {
			System.out.println(num2 + "は奇数です");
		}
		
		//Q4
		Greeting.sayHello();
		
		
		//Q5
		Animal animal = new Animal();
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);
		animal.showInfo();

		
		
	}
		
	
		
		
		
		
		
		
		
	

}
