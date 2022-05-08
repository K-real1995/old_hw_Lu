import java.util.Scanner;
//Написать программу определяющую по значению переменной время года.
//Решение представить с использованием операторов switch (2 варианта).
//Сделать проверку данных на корректность (месяцы 1 -12)

public class SeasonsWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какой сейчас месяц? Введите числом:");
        int season = scanner.nextInt();
        switch (season) {
            case 1, 2, 12 -> System.out.println("Сейчас зима!");
            case 3, 4, 5 -> System.out.println("Сейчас весна!");
            case 6, 7, 8 -> System.out.println("Сейчас лето!");
            case 9, 10, 11 -> System.out.println("Сейчас осень!");
            default -> System.out.println("Вы ввели не верное число попробуйте еще раз");
        }
    }
}
