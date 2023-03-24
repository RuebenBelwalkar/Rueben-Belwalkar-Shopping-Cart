package com.ani.shopping_cart.cart;

import java.util.ArrayList;

import com.ani.shopping_cart.item.Item;
import com.ani.shopping_cart.item.ItemDb;
import com.ani.shopping_cart.user.User;
import com.ani.shopping_cart.user.UserDb;

public class CartDb {
    private static final ArrayList<Cart> carts = new ArrayList<>();

    public static void addCart(int cartId, int userId) {

        User user = UserDb.findUserById(userId);

        Cart cart = new Cart();
        cart.setId(cartId);
        cart.setUser(user);
        carts.add(cart);
    }

    public static void addItemToCart(int userId, int itemId) {

        User user = UserDb.findUserById(userId);
       Cart cart=user.getCart();

        Item item = ItemDb.findItemById(itemId);
        
        cart.getItems().add(item);
    }

    public static List<Cart> allCarts() {
        return carts;
    }

    public static List<Item> findItemsByCartId(int cartId) {
        return findCartById(cartId).getItems();
    }

    public static Cart findCartById(int cartId) {
        for( Cart cart : carts) {
            if(cart.getId() == cartId) {
                return cart;
            }
        }
        throw new CartNotFoundException("❌ Cart Id " + cartId +" Not Found");
    }
}
