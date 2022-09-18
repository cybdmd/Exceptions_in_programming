/*
Урок 1. Домашнее задание 1.2 
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

import java.util.Arrays;  

public class Task3 {

	public static int[] returnNewArray() {
	    	int[] array1 = {1, 2, 3, 4, 5};
	    	int[] array2 = {5, 4, 3, 2, 1};
	    	int[] array3 = new int[array1.length];   
	    	if (array1.length != array2.length) {
	    		throw new RuntimeException("Длины массивов не равны.");
	    	}
	    	for (int i = 0; i < array1.length; i++){
	    		array3[i] = array1[i] - array2[i];
	    	}
	    	return array3;
	}
	public static void main(String args[]) {
		Task3 obj = new Task3();
      		int arr[] = obj.returnNewArray();
    		System.out.println(Arrays.toString(arr));          
    	}
}
