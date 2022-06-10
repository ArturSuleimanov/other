package day11;

public class Warehouse {
    private long countOrder;
    private double balance;


    public long getCountOrder() {
        return countOrder;
    }
    public void setCountOrder(long countOrder) {
        this.countOrder = countOrder;
    }

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
