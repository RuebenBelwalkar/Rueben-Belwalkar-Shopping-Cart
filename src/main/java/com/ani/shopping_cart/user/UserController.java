package com.ani.shopping_cart.user;

public class UserController {
    public void createNewUser(int id, String name) {
        int sts = UserDb.addNewUser(id, name);
        if (sts == UserDb.NO_MORE_SPACE) {
            System.out.println("\n ❌ There is no more space ");
        } else if (sts == UserDb.USER_ALREADY_EXISTS) {
            System.out.println("\n ❌ User Already Exists ");
        } else {
            System.out.println("\n ✅ User Successfully Created ");
        }
        System.out.println("\n\n\n");
    }

    public void listAllUsers() {
        User[] users = UserDb.listUsers();
        for (User user : users) {
            if (user != null) {
                System.out.println("\n 👉 Id " + user.getId() + " Name " + user.getName());
            }
        }
        System.out.println("\n\n\n");
    }

    public double totalCartPrice() {
        return 0;
    }
    public void SelectAUser(int id) {
    	User user = UserDb.selectUser(id);

		if (user == null) {
			System.out.println("Id is not present");
		} else {
			System.out.println("ID : " + user.getId());
			System.out.println("Name: " + user.getName());
			System.out.println("----------------");
		}
	} 
}
