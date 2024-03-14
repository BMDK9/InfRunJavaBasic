package oop;

public class Question3 {

    static class Book {

        String title;
        String author;
        int page;

        Book () {
            this("", "", 0);
        }
        Book(String title, String author) {
            this(title, author, 0);
        }
        Book(String title, String author, int page) {
            this.title = title;
            this.author = author;
            this.page = page;
        }

        void displayInfo() {
            System.out.println("title : " + title + ", author : " + author + ", page : " + page);
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.displayInfo();
        Book book2 = new Book("Hello, Java", "Seo");
        book2.displayInfo();
        Book book3 = new Book("Hello, Java", "Seo", 700);
        book3.displayInfo();
    }
}
