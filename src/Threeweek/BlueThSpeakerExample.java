package Threeweek;

public class BlueThSpeakerExample {
    public static void main(String[] args) {
        BlueThSpeaker mySpeaker = new BlueThSpeaker("JBL", "Black");


        System.out.println("모델:" + mySpeaker.model); //여기는 Speaker로 부터 상속받은 필드 읽는 부분입니다.
        System.out.println("색상:" + mySpeaker.color);
    }
}
