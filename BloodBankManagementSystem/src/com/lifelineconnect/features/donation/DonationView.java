package com.lifelineconnect.features.donation;

public class DonationView {

    private final DonationModel model;

    public DonationView() {
        model = new DonationModel(this);
    }

    public void init() {
        model.init();
        System.out.println("DonationView--" + model);
    }

    public void onDonationCompleted() {
        new DonationView();
    }
}
