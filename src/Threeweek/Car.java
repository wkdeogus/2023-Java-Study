/* 부모클래스를 오버라이딩한후 메소드를 호출하여 원하는 출력값이 나오도록 하시오*/


package Threeweek;

public class Car {

    public void startCar() {
        System.out.println("시동을 겁니다.");
    }

    public void drive() {
        System.out.println("일반모드로 주행합니다");
    }

    public void stopCar() {
        System.out.println("시동을 끕니다.");
    }

}
