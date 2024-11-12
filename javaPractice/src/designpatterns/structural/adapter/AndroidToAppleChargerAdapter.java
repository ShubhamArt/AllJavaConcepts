package designpatterns.structural.adapter;

public class AndroidToAppleChargerAdapter implements AppleCharger{
    private AndroidCharger androidCharger;

    public AndroidToAppleChargerAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }
    @Override
    public void chargeWithLightning() {
        System.out.println("Adapter converts Lightning to USB.");
        androidCharger.chargeWithUSB();
    }
}
