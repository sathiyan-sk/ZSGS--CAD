package com.lifelineconnect.features.complaint;

public class ComplaintModel {

    private final ComplaintView view;

    public ComplaintModel(ComplaintView view) {
        this.view = view;
    }

    void init() {
        System.out.println("ComplaintModel--" + view);
    }
}
