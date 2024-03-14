package oop;

public class MusicPlayerPrac {

    private static class MusicPlayerDataPrac {
        int volume;
        boolean isOn;

        private MusicPlayerDataPrac(int volume, boolean isOn) {
            this.volume = volume;
            this.isOn = isOn;
        }

        private void volumeUp() {
            volume++;
        }
    }

    public static void main(String[] args) {
        MusicPlayerDataPrac data = new MusicPlayerDataPrac(0, false);

        playerOn(data);
        data.volumeUp();
        data.volumeUp();
        volumeDown(data);
        playerStatus(data);
        playerOff(data);
    }

    private static void playerStatus(MusicPlayerDataPrac data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    private static void playerOff(MusicPlayerDataPrac data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    private static void playerOn(MusicPlayerDataPrac data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

//    private static void volumeUp(MusicPlayerDataPrac data) {
//        data.volume++;
//        System.out.println("음악 플레이어 볼륨 : " + data.volume);
//    }

    private static void volumeDown(MusicPlayerDataPrac data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
}
