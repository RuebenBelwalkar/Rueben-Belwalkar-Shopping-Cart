package com.ani.shopping_cart.user;

import com.ani.shopping_cart.cart.CartMenu;

import com.ani.shopping_cart.cart.CartController;

import com.ani.shopping_cart.all.menu.ShowMenu;

public class UserMenu {
    
	private ShowMenu sm;
    private final CartDataInput ip;
    private final UserController controller;
    private  CartController cartController;
    private  CartMenu cartMenu;
   public UserMenu() {
       sm=new ShowMenu();
        ip = new CartDataInput();
        controller=new UserController();
        cartController=new CartController();
        cartMenu= new CartMenu(ip, cartController, null);
   }

   public void performAction() {

       while (true) {
       sm.displayUserMenu();
        int ch=0;
        try {
        ch= ip.askForUserChoice();
        }
        catch(Exception e) {
            System.out.println("\n ❌ Enter Numbers Only \n");
        }

           if (ch == 4) {
               System.out.println("\n  Thanks for using our services hope you have a good day");
               break;
           } else {
               if (ch == 1) {
                    System.out.println("\n 👏 You selected New User \n");
                       try {
                           int id = ip.askForId();
                           String name = ip.askForName();
                           controller.createNewUser(id, name);
                       } catch (Exception e) {
                           System.out.println(e.getMessage());
                       }
                   }
               
           if (ch == 2) {
                   
                System.out.println(" \n 👏 You selected List users \n ");
                controller.listAllUsers();	
               } 
           if (ch == 3) {
                System.out.println(" \n 👏 Entering to User Cart \n ");
                
                int userId = ip.askForId();
                try {
                    cartController.setUserId(userId);
                }
                catch (Exception e) {
                    
                }
                
                cartMenu.performAction();
                   
               }
           }

       }
   }
}
