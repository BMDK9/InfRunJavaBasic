package oop;

public class Question1 {
    static class Rectangle {
        int width;
        int height;
        int area;
        int perimeter;
        boolean square;

        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        void getArea() {
            area = width * height;
            System.out.println("넓이 : " + area);
        }

        void getPerimeter() {
            perimeter = 2 * (width + height);
            System.out.println("둘레 길이 : " + perimeter);
        }

        void isSquare() {
            square = (width == height);
            System.out.println("정사각형 여부 : " + square);
        }
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(7, 5);
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.isSquare();
    }
}
