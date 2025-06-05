package com.lifelineconnect.features.admin;

public class AdminView {

    private final AdminModel model;

    public AdminView() {
        model = new AdminModel(this);
    }

    public void init() {
        model.init();
        System.out.println("AdminView--" + model);
    }

    public void onAdminAccessGranted() {
        new AdminView();
    }
    public void proceedLogin() {
        System.out.println("=== Login Page ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.println("Attempting login for: " + username);
    }

    public void proceedLogout() {
        System.out.println("=== Logout ===");
        System.out.println("You have been successfully logged out.");
    }
    
}
