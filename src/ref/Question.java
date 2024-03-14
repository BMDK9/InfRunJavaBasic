package ref;

import java.util.Scanner;

public class Question {

    private static Scanner scanner = new Scanner(System.in);

    public static class ProductOrder {

        String productName;
        int price;
        int quantity;

        public ProductOrder(String productName, int price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int time = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[time];

        createOrder(orders);
        printOrders(orders);
        getTotalAmount(orders);
    }

    private static void getTotalAmount(ProductOrder[] orders) {
        int total = 0;

        for (ProductOrder p : orders) {
            total += p.price * p.quantity;
        }
        System.out.println("총 결제 금액 : " + total);
    }

    private static void printOrders(ProductOrder[] orders) {

        for (ProductOrder p : orders) {
            System.out.println(
                    "상품명 : " + p.productName + "/ 가격 : " + p.price + "/ 수량" + p.quantity);
        }
    }

    private static void createOrder(ProductOrder[] orders) {

        for (int i = 0; i < orders.length; i++) {
            scanner.nextLine();
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            ProductOrder createdOrder = new ProductOrder(productName, price, quantity);
            orders[i] = createdOrder;
        }
    }
}
