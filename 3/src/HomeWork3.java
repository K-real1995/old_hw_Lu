public class HomeWork3 {
    public static void main(String[] args) {
        //Вводим коэффициенты a,b,c
        double a = 1;
        double b = -4;
        double c = 1;
        //Выводим результат подсчета дискриминанта
        System.out.println("Дискриминант равен: " + discriminant(a,b,c));
        double d = discriminant(a,b,c);
        //Выводим результат подсчета квадратных корней
        System.out.println(quadraticEquation(d,a,b));
        //Вводим число от которого необходимо получить факториал
        int n = 4;
        //Выводим результат факториала
        System.out.println(calculateFactorial(n));
        //Вводим числа x и y
        int x = 5;
        int y = 13;
        //Выводим результат возведения числа x в степень y
        System.out.println(pow(x,y));

    }
    //Переписать задачу на квадратное уравнение выделив отдельные статические методы для вычисления
    //дискриминанта и расчета корней

    //Метод вычисления дискриминанта
    public static double discriminant (double a, double b, double c){
        return b * b - 4 * a * c;
    }

    //Метод расчета квадратных корней
    public static String quadraticEquation(double d, double a, double b){
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            return "Корни уравнения: x1 = " + x1 + ", x2 = " + x2;
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            return "Уравнение имеет единственный корень: x = " + x;
        } else {
            return "Уравнение не имеет действительных корней";
        }
    }
    //Написать статические методы:
    //- взятия факториала некоторого числа
    //- возведения числа x в степень y

    //Метод взятия факториала от числа n введенного с консоли
    public static String calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return "Факториал от числа " + n + " равен: " + result;
    }
    //Метод возведения числа x в степень y
    public static String pow(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return "Результат возведения числа " + x + " в степень " + y + " равен: " + result;

    }

}
