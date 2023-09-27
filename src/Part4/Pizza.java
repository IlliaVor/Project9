package Part4;

public class Pizza {
    private int price;
    private String name;
    public Pizza() {

    }

    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPizzaInfo() {
        return "Pizza Name: " + name + ", Pizza price: " + price;
    }
}

