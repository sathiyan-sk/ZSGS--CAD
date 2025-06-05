package com.lifelineconnect.features.request;

public class RequestView {

    private final RequestModel model;

    public RequestView() {
        model = new RequestModel(this);
    }

    public void init() {
        model.init();
        System.out.println("RequestView--" + model);
    }

    public void onRequestMade() {
        new RequestView();
    }
}
