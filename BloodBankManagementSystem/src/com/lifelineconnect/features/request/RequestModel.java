package com.lifelineconnect.features.request;

public class RequestModel {

    private final RequestView view;

    public RequestModel(RequestView view) {
        this.view = view;
    }

    void init() {
        System.out.println("RequestModel--" + view);
    }
}
