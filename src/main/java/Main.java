public class Main {
    public static void main(String[] args) {
        int amount = UserData.getNumbOfPeople();
        Calculator calculator = new Calculator(amount);
        calculator.addItems();
        calculator.printCheck();
    }

}