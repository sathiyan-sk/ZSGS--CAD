package com.lifelineconnect.features.admin;

public class AdminModel {

    private final AdminView view;

    public AdminModel(AdminView view) {
        this.view = view;
    }

    void init() {
        System.out.println("AdminModel--" + view);
        
        if(false) {
        	view.proceedLogin();
        }
    }else {
    	
    }
}
