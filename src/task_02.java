
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("Введите действие с числами (+ - / *): ");
        String d = sc.next();
        float res = 0;
        switch (d) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "/":
                res = a / b;
                break;
            case "*":
                res = a * b;
                break;
            default:
                System.out.println("Введён некоррекнтый символ операции");
        }
        System.out.printf("%d %s %d = %.2f",a,d,b,res);
        Formatter f = new Formatter();
        String file = "task_02.log";
        FileWriter fw = new FileWriter(file, true);
        fw.write(f.format("%d %s %d = %.2f",a,d,b,res).toString()+"\n");
        fw.flush();
        fw.close();
    }
    public static void log(int[] arr){

    }
}