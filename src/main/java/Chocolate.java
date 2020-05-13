public class Chocolate extends Sweetness {
    private int cacaoInChocolate; // процент какао в шоколаде

    public Chocolate(String name, double weight, double price, int cacaoInChocolate) {
        super(name, weight, price);
        this.cacaoInChocolate = cacaoInChocolate;
    }

    public void setCacaoInChocolate(int cacaoInChocolate) {
        this.cacaoInChocolate = cacaoInChocolate;
    }

    public int getCacaoInChocolate() {
        return cacaoInChocolate;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", % какао в шоколаде = " + this.getCacaoInChocolate();
    }
}
