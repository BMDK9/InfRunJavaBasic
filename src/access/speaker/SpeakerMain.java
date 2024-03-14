package access.speaker;

public class SpeakerMain {

    public static void main(String[] args) {

        Speaker speaker = new Speaker(99);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeDown();

        Speaker speaker1 = new Speaker(1);
        speaker1.showVolume();
        speaker1.volumeDown();
        speaker1.volumeDown();
        speaker1.volumeDown();
    }
}
