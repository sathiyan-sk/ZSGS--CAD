package com.lifelineconnect.features.donor;

public class DonorModel {
    
    private final DonorView view;

    public DonorModel(DonorView donorView) {
        this.view = donorView;
    }

    void init() {
        System.out.println("DonorModel--" + view);
    }
}
