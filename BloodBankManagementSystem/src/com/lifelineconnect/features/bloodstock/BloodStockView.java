package com.lifelineconnect.features.bloodstock;

public class BloodStockView {

    private final BloodStockModel model;

    public BloodStockView() {
        model = new BloodStockModel(this);
    }

    public void init() {
        model.init();
        System.out.println("BloodStockView--" + model);
    }

    public void onStockUpdated() {
        new BloodStockView();
    }
}
