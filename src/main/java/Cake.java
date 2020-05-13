public class Cake extends Sweetness {
    private boolean forVegan; // подходит для веганов или нет

    public Cake(String name, double weight, double price, boolean forVegan) {
        super(name, weight, price);
        this.forVegan = forVegan;
    }

    public boolean isForVegan() {
        return forVegan;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", веганский = " + this.isForVegan();
    }

    public void setForVegan(boolean forVegan) {
        this.forVegan = forVegan;
    }
}
