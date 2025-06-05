package com.lifelineconnect.features.user;

 class UserModel {
	
private final UserView view;
	
	public UserModel(UserView userView) {
		view =userView;
	}
	void intt() {
		System.out.println("UserModel--"+view);
	}
	
}
