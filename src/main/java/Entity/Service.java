package Entity;

public class Service implements IService {// интерфейс услуги
    private String name;
    private boolean isAvailable;
    private double price;

    public Service(String name, boolean isAvailable, double price) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
