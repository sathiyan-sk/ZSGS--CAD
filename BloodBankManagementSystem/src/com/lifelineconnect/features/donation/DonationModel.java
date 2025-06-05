package com.lifelineconnect.features.donation;

public class DonationModel {

    private final DonationView view;

    public DonationModel(DonationView view) {
        this.view = view;
    }

    void init() {
        System.out.println("DonationModel--" + view);
    }
}
