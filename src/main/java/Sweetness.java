public abstract class Sweetness {
    private String name;
    private double weight;
    private double price;

    public Sweetness(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Название = '" + this.getName() + '\'' +
                ", вес = " + this.getWeight() + " г" +
                ", цена = " + this.getPrice() + " руб";
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
