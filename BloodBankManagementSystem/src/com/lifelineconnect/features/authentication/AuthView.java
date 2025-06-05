package com.lifelineconnect.features.authentication;

public class AuthView {

    private final AuthModel model;

    public AuthView() {
        model = new AuthModel(this);
    }

    public void init() {
        model.init();
        System.out.println("AuthView--" + model);
    }

    public void onLoginSuccess() {
        new AuthView();
    }
}
