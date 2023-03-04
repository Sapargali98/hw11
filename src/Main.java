import java.util.*;
public class Main {
    public static double divide(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("Нельзя делить на ноль.");
        }
        return x / y;
    }
        public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);//#1
        System.out.print("Введите число: ");
        try {
            double myNumber = sc.nextDouble();
            double sqrt = Math.sqrt(myNumber);
            System.out.println("Квадратный корень из числа " + myNumber + " это " + sqrt);
        } catch (Exception e) {
            System.out.println("Неверный Ввод.");
        }

        try {
        double myresult = divide(10,5);
        System.out.println("Результат: " + myresult);}
        catch (Exception e) {
        System.out.println("Произошла ошибка: " + e.getMessage());
    }
        Scanner scanner = new Scanner(System.in);//#3
        System.out.print("Введите строку целых чисел: ");
        String input = scanner.nextLine();
        scanner.close();
        String[] tokens = input.split("  ");
        int sum = 0;
        for (String token : tokens) {
            try {
            int myN = Integer.parseInt(token);
            sum += myN;
        } catch (NumberFormatException e) {
            System.out.println("'" + token + "' не является целым числом.");}}
        System.out.println("Сумма целых чисел в строке равна " + sum + ".");}}


        */