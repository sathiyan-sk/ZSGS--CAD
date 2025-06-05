package com.lifelineconnect.features.complaint;

public class ComplaintView {

    private final ComplaintModel model;

    public ComplaintView() {
        model = new ComplaintModel(this);
    }

    public void init() {
        model.init();
        System.out.println("ComplaintView--" + model);
    }

    public void onComplaintRegistered() {
        new ComplaintView();
    }
}
