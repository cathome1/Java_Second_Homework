import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class task_01 {
    public static void main(String[] args) throws Exception{
        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] crude = massiv(s);
        System.out.println(Arrays.toString(crude));
        System.out.println(Arrays.toString(sort(crude)));
    }
    public static int[] massiv(int size) {
        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }
    public static int[] sort(int[] arr)throws Exception {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    log(arr);
                }
            }
        }
        return arr;
    }
    public static void log(int[] arr)throws Exception{
        String file = "task_01.log";
        FileWriter fw = new FileWriter(file, true);
        fw.write(Arrays.toString(arr)+"\n");
        fw.flush();
        fw.close();
    }
}
