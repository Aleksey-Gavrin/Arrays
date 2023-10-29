import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Результат выполнения задания 1:");
        task1();
        System.out.println();
        System.out.println("Результат выполнения задания 2:");
        task2();
        System.out.println();
        System.out.println("Результат выполнения задания 3:");
        task3();
        System.out.println();
        System.out.println("Результат выполнения задания 4:");
        task4();
    }
//    Задание 1
//    Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
//    Постарайтесь заполнить обе диагонали в одном цикле.

    public static void task1() {
        int[][] matrix = new int[3][3];
        int a = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                matrix[i] = new int[]{a, 0, a};
            } else {
                matrix[i] = new int[]{0, a, 0};
            }

        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
//    Задание 2
//    Нам дан массив чисел: {5, 4, 3, 2, 1}
//    Необходимо привести его к виду: {1, 2, 3, 4, 5}
//    Решите задачу с использованием дополнительного массива.
//    Напечатайте массив до преобразования и после с помощью
//    System.out.println(Arrays.toString(arr));

    public static void task2() {
        int[] before = {5, 4, 3, 2, 1};
        int[] after = new int[before.length];
        for (int i = 0; i <= (before.length - 1); i++) {
            after[after.length - 1 - i] = before[i];
        }
        System.out.println(Arrays.toString(before));
        System.out.println(Arrays.toString(after));
    }
//    Задание 3
//    Решите предыдущее задание, но без использования дополнительного массива.
//    Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
//    Выведите результат программы в консоль тем же способом.
//    **Уточнения**:
//    - Это задание не на сортировку.
//    - Не использовать Arrays.sort() и другие способы сортировок.
//    - Числа в порядке убывания даны исключительно для указания направления чтения.
//    - Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.

    public static void task3() {
        int[] array = {5, 4, 3, 2, 1};
        int temp;
        for (int i = 0; i < (array.length / 2); i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
//    Задание 4
//    Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
//    Необходимо найти все пары чисел, сумма которых равна −2.
//    Напечатать эти числа в консоль.

    public static void task4() {
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sumResult = -2, leftIndex = 0, rightIndex = (array.length - 1);
        boolean pairExists = false;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        while (leftIndex < rightIndex) {
            int sumOfTwo = array[leftIndex] + array[rightIndex];
            if (sumOfTwo == sumResult) {
                System.out.println("Искомая пара чисел, в сумме дающая " + sumResult + ": " + array[leftIndex] + " и " + array[rightIndex]);
                pairExists = true;
                rightIndex--;
            }
            else if (sumOfTwo < sumResult) {
                leftIndex++;
            }
            else {
                rightIndex--;
            }
        }
        if (!pairExists) {
            System.out.println("Пары чисел, в сумме дающих " + sumResult + " нет в массиве.");
        }
    }
}