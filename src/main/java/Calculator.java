import java.util.Scanner;

public class Calculator {

    double sum;
    int amount;
    StringBuilder items;

    Calculator(int amount) {
        this.amount = amount;
        sum = 0;
        items = new StringBuilder();
    }

    public void printCheck() {
        System.out.println("Добавленные товары:");
        System.out.println(items.toString());

        double payment = Format.round(sum / amount, 2);
        System.out.println("Каждый человек должен заплатить " + payment + " " + Format.getEnding((int) payment) + ".");
    }

    public void addItems() {
        System.out.println("Составим список товаров.");
        System.out.println("После добавления товара напишите \"Завершить\" чтобы закончить список. " +
                "Либо введите любой другой символ или слово для продолжения.");
        Scanner scanner = new Scanner(System.in);
        do {
            addItem();
            System.out.println("Продолжить?");
        } while (!scanner.nextLine().equalsIgnoreCase("завершить"));
    }

    private void addItem() {
        String name = UserData.getName();
        double price = UserData.getValidPrice();
        sum += price;
        items.append(name).append(". Cтоимость - ").append(price)
                .append(" ").append(Format.getEnding((int) price)).append(".\n");
        System.out.println("Товар \"" + name + "\" был успешно добавлен.");
    }


}
