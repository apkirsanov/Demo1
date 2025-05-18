package homework_5;

public class Cards {
    public static void main(String[] args) {
        CreditCard cardMIR = new CreditCard("009", 10000);
        CreditCard cardMASTER = new CreditCard("342", 1250);
        CreditCard cardVISA = new CreditCard("698", 1749);
        cardMIR.deposit(250);
        cardMASTER.deposit(300);
        cardVISA.withdrawal(100);
        cardMIR.Balance();
        cardMASTER.Balance();
        cardVISA.Balance();
    }
}
