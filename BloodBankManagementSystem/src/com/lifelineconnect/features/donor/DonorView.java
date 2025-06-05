package com.lifelineconnect.features.donor;

public class DonorView {

    private final DonorModel model;

    public DonorView() {
        model = new DonorModel(this);
    }

    public void init() {
        model.init();
        System.out.println("DonorView--" + model);
    }

    public void onDonorRegistered() {
        new DonorView();
    }
}
