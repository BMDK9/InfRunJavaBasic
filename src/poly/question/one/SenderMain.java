package poly.question.one;

public class SenderMain {

    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender s : senders) {
            s.sendMessage("환영합니다!");
        }
    }

}
