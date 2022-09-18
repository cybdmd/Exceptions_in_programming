/*
Урок 2. Домашнее задание 2.4 
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
                
        System.out.print("Введите слово: ");
        	String word = sc.nextLine();
		if  (word.isEmpty()) {
			System.out.println("Пустые строки вводить нельзя.");
			throw new RuntimeException("Вы ввели пустую строку.");
		}
		System.out.println("Вы ввели: " + word);
    }
}

