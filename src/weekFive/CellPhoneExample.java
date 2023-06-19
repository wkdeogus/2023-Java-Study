package weekFive;

public class CellPhoneExample {
    public static void main(String[] args) {
        CellPhone myCellPhone = new CellPhone();

        myCellPhone.phone = new Phone();
        myCellPhone.turnon();

        myCellPhone.phone = new SamsungPhone();
        myCellPhone.turnon();

        myCellPhone.phone = new ApplePhone();
        myCellPhone.turnon();
    }
}
