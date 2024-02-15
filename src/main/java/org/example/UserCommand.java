package org.example;

import java.util.Scanner;

/***
 * @apiNote Обработка данных, введенных пользователем через консоль
 */
public class UserCommand {
    private Scanner scanner;

    public UserCommand() {
        scanner = new Scanner(System.in);
    }

    public String askName() {
        System.out.println("Введите имя");
        return scanner.next();
    }

    public int askPhoneNumber() {
        System.out.println("Введите номер телефона");
        return scanner.nextInt();
    }

    public String askCommand() {
        System.out.println("Для выхода введите команду 'quit'");
        return scanner.next();
    }
}