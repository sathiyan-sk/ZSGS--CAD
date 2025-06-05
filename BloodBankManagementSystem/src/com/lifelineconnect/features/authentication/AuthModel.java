package com.lifelineconnect.features.authentication;

public class AuthModel {

    private final AuthView view;

    public AuthModel(AuthView view) {
        this.view = view;
    }

    void init() {
        System.out.println("AuthModel--" + view);
    }
}
