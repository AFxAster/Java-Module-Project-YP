import java.util.Locale;
import java.util.Scanner;

public class UserData {

    public static int getNumbOfPeople() {
        System.out.println("На скольких человек необходимо разделить счёт?");
        Scanner scanner = new Scanner(System.in);
        int amount;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Введите целое число.");
                scanner.nextLine();
            }

            amount = scanner.nextInt();
            scanner.nextLine();
            if (amount < 1) {
                System.out.println("Некорректное значение для подсчёта. Введите число большее 1.");
            } else if (amount == 1) {
                System.out.println("Разделять чек для одного человека нет необходимости. Введите число большее 1.");
            } else {
                return amount;
            }
        }
    }
    public static double getValidPrice() {
        System.out.println("Укажите стоимость товара:");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double price;
        while (true) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Введите число в формате \"рубли.копейки\".");
                scanner.nextLine();
            }
            price = scanner.nextDouble();
            scanner.nextLine();
            if (price >= 0) {
                return price;
            }
            System.out.println("Цена должна быть неотрицательной.");
        }
    }
    public static String getName() {
        System.out.println("Введите наименование товара:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
