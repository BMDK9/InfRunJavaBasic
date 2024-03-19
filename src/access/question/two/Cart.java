package access.question.two;

public class Cart {

    private final Item[] items;
    private int itemCount;

    public Cart() {
        items = new Item[10];
        itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount > items.length) {
            System.out.println("더이상 담을 수 없습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(
                    "상품명 : " + items[i].getName() + ", 합계 : " + items[i].getTotalPrice());
        }
    }

    public void getTotalPrice() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 : " + total);
    }
}
