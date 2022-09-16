/*
Урок 1. Домашнее задание 1.1 
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
*/

public class Task1 {
	private static final int MIN_K = 5;
	public static void main(String args[]) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
						
		//System.out.println(devide(10, 0));
		//System.out.println(getArrayLength(arr));
		System.out.println(getArrayValue(arr));
		          
    	}
    	// метод деления
	public static int devide(int x, int y){
		if (y == 0){
			throw new RuntimeException("Division by zero.");
		}
		return x / y;
	}
	// метод нахождения длины массива
	public static int getArrayLength(int[] array){
		if (array.length <= 5){
			throw new RuntimeException("Insufficient array length.");
		}
		return array.length;
	}
	// метод получения значения массива
	public static int getArrayValue(int[] array){
		if (array.length < (MIN_K-1)){
			throw new RuntimeException("Insufficient array length.");
		}
		return array[MIN_K];
	}
	
}
