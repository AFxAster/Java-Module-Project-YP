public class Main {
    public static void main(String[] args) {
        UserData userData = new UserData();
        int amount = userData.getNumbOfPeople();
        Calculator calculator = new Calculator(amount);
        calculator.addItems();
        calculator.printCheck();
    }

}