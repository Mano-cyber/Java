package Mano;

public class Main {

    public static void main(String[] args) {
        ITelephone manosPhone;
        manosPhone = new DeskPhone(12345);
        manosPhone.powerOn();
        manosPhone.callPhone(12345);
        manosPhone.answer();

        manosPhone = new MobilePhone(246843);
        manosPhone.powerOn();
        manosPhone.callPhone(246843);
        manosPhone.answer();
    }
}
