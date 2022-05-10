import java.util.Arrays;
public class HomeWork2 {
    public static void main(String[] args) {
        //Вызов первого заданий
        sqr();
        //Вызов второго задания
        threeAndNines();
        //Передаем две матрицы [3][3], и вызываем третье задание
        int[][] matrix1 = {{5, 7, 3}, {7, 0, 1}, {8, 1, 2}};
        int[][] matrix2 = {{5, 7, 3}, {7, 0, 1}, {8, 1, 2}};
        int[][] sum = sumMatrix(matrix1, matrix2);
        for (int[] aSum : sum) {
            System.out.println(Arrays.toString(aSum));
        }
        //Передаем массив и вызываем четвертое задание
        int[]arr={3,4,87,6,7,45,25,151,51};
        int[] result = bubbleSort(arr);
        System.out.println(Arrays.toString(result));

    }

    //Составьте программу, выводящую на экран квадраты чисел от 1 до 25.
    public static void sqr() {
        for (int i = 1; i < 26; i++) {
            System.out.println(i * i);
        }
    }
    //Даны числа от 100 до 1000. Вывести числа, которые делятся на 3 и не делятся на 9 на цело.
    public static void threeAndNines() {
        for (int i = 100; i < 1001; i++) {
            if (i % 3 == 0 & i % 9 != 0) {
                System.out.println(i);
            }
        }
    }
    //Даны две матрицы (два двумерных int массива одинаковой размерности). Найти сумму матриц
    public static int[][] sumMatrix ( int[][] matrix1, int[][] matrix2){
        int[][] sum = new int[3][3];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix2.length; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
        return sum;
        }
    //Реализовать алгоритм сортировки пузырьком для массива типа int
    public static int[] bubbleSort(int[] arr){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        return arr;
    }
}


