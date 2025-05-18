package homework_5;

public class CreditCard {
    String cardNumber;
    double balance;
    public CreditCard(String cardNumber, double actualAmount) {
        this.cardNumber = cardNumber;
        this.balance = actualAmount;
    }
    public void deposit(double actualAmount) {
        balance += actualAmount;
        System.out.println("На карту " + cardNumber + " зачислено: " + actualAmount);
    }
    public void withdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
        System.out.println("С карты " + cardNumber + " снято: " + withdrawalAmount);
        System.out.println();
    }
    public void Balance() {
        System.out.println("Текущий баланс карты " + cardNumber + ": " + balance);
    }
}
