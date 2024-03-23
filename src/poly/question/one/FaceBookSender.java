package poly.question.one;

public class FaceBookSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("FaceBook에서 발송합니다: " + message);
    }
}
