import java.util.Scanner;

//Написать программу определяющую по значению переменной время года.
//Решение представить с использованием операторов if
//Сделать проверку данных на корректность (месяцы 1 -12)
public class SeasonsWithIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какой сейчас месяц? Введите числом:");
        int season = scanner.nextInt();
        if (season>=3 & season <= 5)
        {
            System.out.println("Cейчас весна!");
        }
        else if(season>=6 & season<=8)
        {
            System.out.println("Сейчас лето!");
        }
        else if(season>=9 & season<=11)
        {
            System.out.println("Сейчас осень!");
        }
        else if(season == 1 || season==2 || season==12)
        {
            System.out.println("Сейчас зима!");
        }
        else
        {
            System.out.println("Вы ввели не верное число попробуйте еще раз");
        }
    }
}
