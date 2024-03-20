package extends1.question.one;

public class Album extends Item {

    private final String artist;
    public Album(String title, int price, String artist) {
        super(title, price);
        this.artist = artist;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트 : " + artist);
    }
}
