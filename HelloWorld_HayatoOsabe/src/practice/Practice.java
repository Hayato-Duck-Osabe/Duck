package practice;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = String.valueOf(123);
		String str1 = Integer.toString(123);
		
		
		
		
		int[] numbers = {10, 20, 30, 40, 50};
		//numbers[1] = 99; // 2番目の要素（インデックス1）を変更
		System.out.println(numbers[1]);  // 出力: 99
		
		 int[] array1 = {1, 2, 3};
		  int[] array2 = {4, 5, 6};
		  int[] mergedArray = Arrays.copyOf(array1, array1.length + array2.length);
		  System.out.println(array1);

	}

}
