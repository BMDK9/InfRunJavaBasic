package class1;

public class Question {

    static class MovieReview {

        String title;
        String review;

        public MovieReview(String title, String review) {
            this.title = title;
            this.review = review;
        }
    }

    static class ProductOrder {

        String productName;
        Integer price;
        Integer quantity;

        public ProductOrder(String productName, Integer price, Integer quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
//        question1();
        question2();
    }

    private static void question2() {
        ProductOrder productOrder1 = new ProductOrder("두부", 2000, 2);
        ProductOrder productOrder2 = new ProductOrder("김치", 5000, 1);
        ProductOrder productOrder3 = new ProductOrder("콜라", 1500, 2);
        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};
        int totalPrice = 0;

        for (ProductOrder p : productOrders) {
            System.out.println(
                    "상품명 : " + p.productName + ", 가격 : " + p.price + ", 수량 : " + p.quantity);
            totalPrice += p.price * p.quantity;
        }
        System.out.println("총 결제 금액 : " + totalPrice);
    }

    private static void question1() {
        MovieReview movieReview1 = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview movieReview2 = new MovieReview("어바웃타임", "인생 영화");

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview m : movieReviews) {
            System.out.println("제목 : " + m.title + " / 리뷰 : " + m.review);
        }
    }
}
