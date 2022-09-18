/*
Урок 2. Домашнее задание 2.2 
Если необходимо, исправьте данный код:

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

*/

public class Task2 {

    public static void main(String[] args) {
	int[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        try {
        	int d = 0;
   		double catchedRes1 = intArray[8] / d;
   		System.out.println("catchedRes1 = " + catchedRes1);
	} catch (ArithmeticException e) {
   		System.out.println("Catching exception: " + e);
	}
    }
}

/* Вывод: Данный код работает, он перехватывает исключение: деление на ноль.
	  Другой вопрос , что такой скрипт нецелесообразно использовать. 
	  Так как делитель равен 0, его надо проверять на валидность.
	  Желательно в блоке if-else.
*/
