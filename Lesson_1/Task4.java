/*
Урок 1. Домашнее задание 1.3 
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/

import java.util.Arrays;  

public class Task4 {

	public static int[] returnNewArray() {
	    	int[] array1 = {10, 8, 6, 4, 2};
	    	int[] array2 = {2, 2, 2, 2, 2};
	    	int[] array3 = new int[array1.length];   
	    	if (array1.length != array2.length) {
	    		throw new RuntimeException("Длины массивов не равны.");
	    	}
	    	for (int i = 0; i < array1.length; i++){
	    		if (array2[i] == 0){
	    			throw new RuntimeException("Деление на ноль не допустимо.");
	    		}
	    		array3[i] = array1[i] / array2[i];
	    	}
	    	return array3;
	}
	public static void main(String args[]) {
		Task4 obj = new Task4();
      		int arr[] = obj.returnNewArray();
    		System.out.println(Arrays.toString(arr));          
    	}
}
