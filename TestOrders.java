import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 100.30);
        Item item2 = new Item("latte", 200.30);
        Item item3 = new Item("drip coffee", 50.30);
        Item item4 = new Item("cappuccino", 100.30);

        Order order1 = new Order("Cinduri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam'");

        System.out.println(order1);
        System.out.println(order1.total);
        //will print 0
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order1.ready = true;
        order4.addMulitpleItems(item2,2);
        order2.ready = true;


    }
}
