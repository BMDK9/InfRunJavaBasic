package access.question.one;

public class MaxCounter {

    private int count;
    private final int max;

    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값입니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
