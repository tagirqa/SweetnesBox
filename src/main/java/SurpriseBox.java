import java.util.*;

public class SurpriseBox implements Fill {
    private List<Sweetness> list = new ArrayList<Sweetness>();

    public void add(Sweetness sweetness) {
        list.add(sweetness);
    }

    public void del(Sweetness sweetness) {  // удаление по объекту
        list.remove(sweetness);
    }

    public void del(int index) {  // удаление по индексу
        list.remove(index);
    }

    public void del() {          // удаление последнего элемента массива
        list.remove(list.size() - 1);
    }

    public void weight() {
        double weightBox = 0.0;
        for (Sweetness sweetness : list) {
            weightBox += sweetness.getWeight();
        }
        System.out.println("Вес коробочки = " + weightBox + " г.");
    }

    public void price() {
        double priceBox = 0.0;
        for (Sweetness sweetness : list) {
            priceBox += sweetness.getPrice();
        }
        System.out.println("Стоимость коробочки = " + priceBox + " руб.");
    }


    public void allSweets() {
        for (Sweetness sweetness : list) {
            System.out.println(sweetness);
        }
    }


    public void reduceWeight(double weight) {
        double weightBox = 0.0;
        Comparator<Sweetness> comparator = Comparator.comparing(Sweetness::getWeight);
        list.sort(comparator);
        for (Sweetness sweetness : list) {
            weightBox += sweetness.getWeight();
        }
        while (weightBox > weight) {
            weightBox -= list.get(0).getWeight();
            list.remove(0);

        }
    }

    public void reducePrice(double price) {
        double priceBox = 0.0;
        Comparator<Sweetness> comparator = Comparator.comparing(Sweetness::getPrice);
        list.sort(comparator);
        for (Sweetness sweetness : list) {
            priceBox += sweetness.getPrice();
        }
        while (priceBox > price) {
            priceBox -= list.get(0).getPrice();
            list.remove(0);

        }
    }


    public static void main(String[] args) {
        SurpriseBox surpriseBox = new SurpriseBox();  // создали коробку

        Cake cake = new Cake("Прага", 1500, 2500, true);   // создали сладости
        Cake cake1 = new Cake("Московскй", 800, 1250, false);
        Lollipop lollipop = new Lollipop("Чупа-Чупс", 30, 10, true);
        Chocolate chocolate = new Chocolate("Аленка", 90, 30, 45);


        surpriseBox.add(cake);  // кладем сладости в коробку
        surpriseBox.add(cake1);
        surpriseBox.add(lollipop);
        surpriseBox.add(chocolate);

        surpriseBox.allSweets(); // смотрим, что лежит в коробке

        System.out.println();

        surpriseBox.del(1); // удаляем из коробки по индексу
        surpriseBox.allSweets();

        System.out.println();

        surpriseBox.reducePrice(1590); // оптимизируем по цене
        surpriseBox.price();
        surpriseBox.allSweets();

        System.out.println();

        surpriseBox.reduceWeight(1500); // оптимизируем по весу
        surpriseBox.weight();
        surpriseBox.allSweets();
    }
}
