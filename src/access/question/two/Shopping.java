package access.question.two;

public class Shopping {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 2000, 6);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
        cart.getTotalPrice();
    }
}
