package oop;

public class MusicPlayer {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.playerOn();
        data.volumeUp();
        data.volumeUp();
        data.volumeDown();
        data.playerStatus();
        data.playerOff();
    }
}
