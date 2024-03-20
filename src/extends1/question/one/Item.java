package extends1.question.one;

public class Item {

    private final String title;
    private final int price;

    public Item(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("제목 : " + title + ", 가격 : " + price);
    }
}
