package com.lifelineconnect.features.user;

public class UserView {
	
private final	UserModel model;
	
	public UserView() {
		model=new UserModel(this);
	}
	
	public void intt() {
		model.intt();
		System.out.println("UserView--"+model);
		
	}
	
	public void onSuccesslogin() {
		new UserView();
	}
}
