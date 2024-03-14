package access.speaker;

public class Speaker {

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {

        if (volume >= 100) {
            System.out.print("최대 음량입니다.");
            showVolume();
        } else {
            System.out.print("음량을 올립니다.");
            volume += 1;
            showVolume();
        }
    }

    void volumeDown() {

        if (volume <= 0) {
            System.out.print("최소 음량입니다.");
            showVolume();
        } else {
            System.out.print("음량을 내립니다.");
            volume -= 1;
            showVolume();
        }
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
