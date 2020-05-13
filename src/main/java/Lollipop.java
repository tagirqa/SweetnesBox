public class Lollipop extends Sweetness {
    private boolean theImport; // импортные леденцы или нет

    public Lollipop(String name, double weight, double price, boolean theImport) {
        super(name, weight, price);
        this.theImport = theImport;
    }

    public void setTheImport(boolean theImport) {
        this.theImport = theImport;
    }

    public boolean isTheImport() {
        return theImport;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", импортный = " + this.isTheImport();
    }
}
