package designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {

        // Creating an Android charger
        AndroidCharger androidCharger = new AndroidCharger();

        // Creating an adapter to use the Android charger with an Apple phone
        AppleCharger adapter = new AndroidToAppleChargerAdapter(androidCharger);

        // Charging Apple phone with adapted Android charger
        ApplePhone applePhone = new ApplePhone(adapter);
        applePhone.charge();
    }
}
