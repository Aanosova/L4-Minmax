
import java.util.Arrays;
import java.util.Random;
/**
        Массив размерностью 20,
        заполняется случайными целыми числами от -10 до 10.
        Найти максимальный отрицательный и минимальный положительный элементы массива.
        Поменять их местами.*/

public class Lesson4 {
    public static void main(String[] args) {
        int array[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
            System.out.print(" " + array[i]);
        }
        int Max = -99;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max & array[i] < 0) Max = array[i];
        }
        System.out.println();
        System.out.println("Максимальное отрицательное значение: " + Max);

        int min = 11;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 & array[i] < min) min = array[i];
        }
        System.out.println("Минимальное положительное значение: " + min);
    }
}