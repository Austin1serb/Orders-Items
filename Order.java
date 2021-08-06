import java.util.ArrayList;
public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item>items;

    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.price;
    }
    public void addMulitpleItems(Item items, int count) {
        for (int i = 0; i < count; i++) {
           addItem(items);
        }
    }
}