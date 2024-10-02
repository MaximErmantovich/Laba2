package Entity;

public class Payment {//услуга
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        if (amount > 0) {
            System.out.println("Оплата на сумму " + amount + " успешно обработана.");
        } else {
            System.out.println("Ошибка: сумма оплаты должна быть больше нуля.");
        }
    }
}
