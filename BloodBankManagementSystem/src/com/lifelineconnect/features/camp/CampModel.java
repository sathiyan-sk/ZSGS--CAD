package com.lifelineconnect.features.camp;

public class CampModel {

    private final CampView view;

    public CampModel(CampView view) {
        this.view = view;
    }

    void init() {
        System.out.println("CampModel--" + view);
    }
}
