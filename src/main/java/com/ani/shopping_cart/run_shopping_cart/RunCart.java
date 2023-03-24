package com.ani.shopping_cart.run_shopping_cart;
import com.ani.shopping_cart.cart.CartController;
import com.ani.shopping_cart.cart.CartMenu;
import com.ani.shopping_cart.input.CartDataInput;
import com.ani.shopping_cart.item.ItemController;
import com.ani.shopping_cart.item.ItemDb;
import com.ani.shopping_cart.user.UserController;
import com.ani.shopping_cart.user.UserMenu;


public class RunCart {
    public static void main(String[] args) {
        UserMenu menu = new UserMenu();
        ItemDb.addItem(1, "pen", 10);
        ItemDb.addItem(2, "eraser", 5);
        ItemDb.addItem(3, "pencil", 8);
        ItemDb.addItem(4, "sharpner", 5);
        ItemDb.addItem(5, "ruler", 30);
        ItemDb.addItem(6, "notebook", 120);
        ItemDb.addItem(7, "bag", 800);
        ItemDb.addItem(8, "bottle", 300);
        ItemDb.addItem(9, "sparkles", 100);
        ItemDb.addItem(10, "colors", 450);

        CartDataInput ip = new CartDataInput();

        UserController userController = new UserController();
        CartController cartController = new CartController();
        ItemController itemController = new ItemController();

        CartMenu cartMenu = new CartMenu(ip, cartController, itemController);

        menu.performAction();
    }
}
