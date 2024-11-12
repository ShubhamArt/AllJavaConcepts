package designpatterns.structural.adapter;

public class ApplePhone {
    private AppleCharger appleCharger;

    public ApplePhone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void charge() {
        System.out.println("Apple phone is charging...");
        appleCharger.chargeWithLightning();
    }
}
