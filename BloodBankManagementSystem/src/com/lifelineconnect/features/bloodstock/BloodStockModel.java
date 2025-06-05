package com.lifelineconnect.features.bloodstock;

public class BloodStockModel {

    private final BloodStockView view;

    public BloodStockModel(BloodStockView view) {
        this.view = view;
    }

    void init() {
        System.out.println("BloodStockModel--" + view);
    }
}
