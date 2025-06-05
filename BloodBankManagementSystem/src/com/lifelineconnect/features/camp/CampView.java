package com.lifelineconnect.features.camp;

public class CampView {

    private final CampModel model;

    public CampView() {
        model = new CampModel(this);
    }

    public void init() {
        model.init();
        System.out.println("CampView--" + model);
    }

    public void onCampCreated() {
        new CampView();
    }
}
