package day11;

public class Courier implements Worker{
    private double salary;

    private Warehouse warehouse;


    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance()+1000);

    }

    @Override
    public void bonus() {
        if(warehouse.getBalance() > 1_000_000) salary *= 2;
    }


    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
